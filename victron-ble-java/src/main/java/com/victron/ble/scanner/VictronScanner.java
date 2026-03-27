package com.victron.ble.scanner;

import com.victron.ble.model.SmartBatterySenseData;
import com.victron.ble.model.VictronAdvertisement;
import com.victron.ble.parser.SmartBatterySenseParser;
import com.welie.blessed.BluetoothCentralManager;
import com.welie.blessed.BluetoothCentralManagerCallback;
import com.welie.blessed.BluetoothPeripheral;
import com.welie.blessed.ScanResult;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * BLE scanner using blessed-bluez.
 *
 * blessed-bluez wraps all the BlueZ DBus signal plumbing internally.
 * We simply implement onDiscoveredPeripheral() and get called back
 * each time an advertisement packet arrives — no manual signal wiring needed.
 *
 * ManufacturerData is provided pre-parsed as Map<Integer, byte[]>
 * keyed by company ID, so extracting Victron's 0x02E1 entry is one lookup.
 */
public class VictronScanner {

    private static final int VICTRON_MANUFACTURER_ID = VictronAdvertisement.VICTRON_MANUFACTURER_ID;

    private final String targetMac;               // null = discover mode
    private final SmartBatterySenseParser parser;  // null = discover mode

    /** Discover mode — list all nearby Victron devices */
    public VictronScanner() {
        this.targetMac = null;
        this.parser    = null;
    }

    /** Read mode — decrypt and parse a specific device */
    public VictronScanner(String macAddress, String advertisementKey) {
        this.targetMac = macAddress.toUpperCase();
        this.parser    = new SmartBatterySenseParser(advertisementKey);
    }

    // -------------------------------------------------------------------------

    public void scan(Consumer<SmartBatterySenseData> onData, int durationSec) throws InterruptedException {
        CountDownLatch done = new CountDownLatch(1);

        BluetoothCentralManagerCallback callback = new BluetoothCentralManagerCallback() {
            @Override
            public void onDiscoveredPeripheral(BluetoothPeripheral peripheral, ScanResult scanResult) {
                String address = peripheral.getAddress().toUpperCase();
                String name    = peripheral.getName();
                int    rssi    = scanResult.getRssi();

                // Extract manufacturer data map from the scan result
                Map<Integer, byte[]> mfrData = scanResult.getManufacturerData();
                if (mfrData == null || !mfrData.containsKey(VICTRON_MANUFACTURER_ID)) return;

                byte[] raw = mfrData.get(VICTRON_MANUFACTURER_ID);

                if (parser == null) {
                    // Discover mode: just print device info once per address
                    System.out.printf("[DISCOVER] %s: %s%n", address, name != null ? name : "Unknown");
                    return;
                }

                // Read mode: filter to target device, then decrypt and print
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

        if (targetMac != null) {
            // Scan filtered to our specific device address — more efficient
            central.scanForPeripheralsWithAddresses(new String[]{ targetMac });
        } else {
            // Discover mode: scan for everything
            central.scanForPeripherals();
        }

        if (durationSec > 0) {
            done.await(durationSec, TimeUnit.SECONDS);
        } else {
            done.await(); // block until Ctrl+C
        }

        central.stopScan();
        System.out.println("[INFO] Scan complete.");
    }
}
