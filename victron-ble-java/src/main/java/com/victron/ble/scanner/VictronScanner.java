package com.victron.ble.scanner;

import com.victron.ble.model.SmartBatterySenseData;
import com.victron.ble.model.VictronAdvertisement;
import com.victron.ble.parser.SmartBatterySenseParser;
import com.welie.blessed.BluetoothCentralManager;
import com.welie.blessed.BluetoothCentralManagerCallback;
import com.welie.blessed.BluetoothPeripheral;
import com.welie.blessed.ScanResult;
import org.freedesktop.dbus.connections.impl.DBusConnection;
import org.freedesktop.dbus.types.Variant;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * BLE scanner using blessed-bluez.
 *
 * Uses unfiltered scanForPeripherals() so BlueZ stays in full active scan mode.
 * Also sets DuplicateData=true via SetDiscoveryFilter before scanning, which
 * tells BlueZ to deliver every advertisement packet regardless of whether the
 * data has changed — matching the behaviour of victron-ble/bleak.
 */
public class VictronScanner {

    private static final int    VICTRON_MANUFACTURER_ID = VictronAdvertisement.VICTRON_MANUFACTURER_ID;
    private static final String BLUEZ_BUS               = "org.bluez";
    private static final String ADAPTER_PATH            = "/org/bluez/hci0";

    private final String targetMac;
    private final SmartBatterySenseParser parser;

    public VictronScanner() {
        this.targetMac = null;
        this.parser    = null;
    }

    public VictronScanner(String macAddress, String advertisementKey) {
        this.targetMac = macAddress.toUpperCase();
        this.parser    = new SmartBatterySenseParser(advertisementKey);
    }

    public void scan(Consumer<SmartBatterySenseData> onData, int durationSec) throws InterruptedException {
        CountDownLatch done = new CountDownLatch(1);

        BluetoothCentralManagerCallback callback = new BluetoothCentralManagerCallback() {
            @Override
            public void onDiscoveredPeripheral(BluetoothPeripheral peripheral, ScanResult scanResult) {
                String address = peripheral.getAddress().toUpperCase();
                String name    = peripheral.getName();
                int    rssi    = scanResult.getRssi();

                Map<Integer, byte[]> mfrData = scanResult.getManufacturerData();
                if (mfrData == null || !mfrData.containsKey(VICTRON_MANUFACTURER_ID)) return;

                byte[] raw = mfrData.get(VICTRON_MANUFACTURER_ID);

                if (parser == null) {
                    System.out.printf("[DISCOVER] %s: %s%n", address, name != null ? name : "Unknown");
                    return;
                }

                if (!targetMac.equals(address)) return;

                VictronAdvertisement advert = new VictronAdvertisement(raw);
                SmartBatterySenseData data  = parser.parse(
                        name != null ? name : "Unknown", address, rssi, advert);

                if (data != null) {
                    onData.accept(data);
                }
            }
        };

        System.out.println("[INFO] Starting BLE scan...");
        BluetoothCentralManager central = new BluetoothCentralManager(callback);

        // Start unfiltered scan first, then immediately set DuplicateData=true.
        // blessed clears any existing filter when it calls StartDiscovery, so we
        // must set our filter AFTER blessed has started scanning.
        central.scanForPeripherals();

        // Small delay to let blessed complete its StartDiscovery DBus call
        Thread.sleep(500);
        setDuplicateDataFilter();

        if (durationSec > 0) {
            done.await(durationSec, TimeUnit.SECONDS);
        } else {
            done.await();
        }

        central.stopScan();
        System.out.println("[INFO] Scan complete.");
    }

    /**
     * Call SetDiscoveryFilter with DuplicateData=true directly on the BlueZ adapter.
     * Called after blessed's StartDiscovery to override its default filter settings.
     * blessed-bluez does not expose DuplicateData directly so we go to DBus ourselves.
     */
    private void setDuplicateDataFilter() {
        try (DBusConnection conn = DBusConnection.getConnection(DBusConnection.DBusBusType.SYSTEM)) {
            org.bluez.Adapter1 adapter = conn.getRemoteObject(BLUEZ_BUS, ADAPTER_PATH, org.bluez.Adapter1.class);

            Map<String, Variant<?>> filter = new HashMap<>();
            filter.put("Transport",      new Variant<>("le"));
            filter.put("DuplicateData",  new Variant<>(Boolean.TRUE));

            adapter.SetDiscoveryFilter(filter);
            System.out.println("[INFO] Set DuplicateData=true on BlueZ adapter");
        } catch (Exception e) {
            System.err.println("[WARN] Could not set DuplicateData filter: " + e.getMessage());
            System.err.println("[WARN] Advertisement rate may be lower than expected");
        }
    }
}
