# victron-ble Java

Java port of [keshavdv/victron-ble](https://github.com/keshavdv/victron-ble) for Linux.

Reads Victron Smart Battery Sense BLE advertisements, decrypts them with AES-128-CTR,
and prints voltage + temperature to stdout.

## Requirements

- Java 11+
- Maven 3.6+
- Linux with BlueZ installed (`sudo apt install bluez`)
- libdbus (`sudo apt install libdbus-1-dev` — usually already present)

## Build

```bash
mvn clean package
```

This produces a fat JAR at `target/victron-ble-1.0.0.jar`.

## Usage

### Discover nearby Victron devices

```bash
sudo java -jar target/victron-ble-1.0.0.jar discover
```

Output:
```
[INFO] Scanning for Victron devices for 30 seconds...
[INFO] Connecting to BlueZ via DBus...
[INFO] Starting BLE scan...
[DISCOVER] CD:C3:E4:90:B1:21: SmartBatterySense HQ23474ZVGQ
```

### Read and decrypt data

Get your advertisement key from VictronConnect:
**Device → Gear icon → Product Info → Instant Readout via Bluetooth → Show**

```bash
sudo java -jar target/victron-ble-1.0.0.jar read "CD:C3:E4:90:B1:21@your32hexkeyhere"
```

Output:
```json
{"name":"SmartBatterySense HQ23474ZVGQ","address":"CD:C3:E4:90:B1:21","rssi":-50,
 "payload":{"model_name":"Smart Battery Sense (Rev2)","voltage":13.01,"temperature":19.75}}
```

### Optional: set scan duration (default 30 seconds)

```bash
sudo java -jar target/victron-ble-1.0.0.jar read "CD:C3:E4:90:B1:21@yourkey" 60
```

## Why `sudo`?

BlueZ's DBus BLE scanning API requires `CAP_NET_RAW`. Either run with `sudo`, or grant
capabilities to your JVM:

```bash
sudo setcap 'cap_net_raw,cap_net_admin+eip' $(which java)
```

## Project structure

```
src/main/java/com/victron/ble/
├── Main.java                         # CLI entry point
├── model/
│   ├── VictronAdvertisement.java     # Raw manufacturer data wrapper + byte layout
│   └── SmartBatterySenseData.java    # Parsed result (voltage, temperature)
├── parser/
│   ├── VictronDecryptor.java         # AES-128-CTR decryption
│   └── SmartBatterySenseParser.java  # Payload byte parser
└── scanner/
    └── VictronScanner.java           # BlueZ DBus BLE scanner
```

## Decryption protocol

Victron uses **AES-128-CTR**:
- **Key**: 16-byte advertisement key from VictronConnect
- **IV**: bytes 5-6 of manufacturer data (little-endian uint16), zero-padded to 16 bytes
- **Ciphertext**: bytes 8+ of manufacturer data

Smart Battery Sense decrypted payload layout:
| Bytes | Field       | Unit    | Formula              |
|-------|-------------|---------|----------------------|
| 0-1   | Voltage     | 10 mV   | `raw / 100.0` → V    |
| 2-3   | Temperature | 0.01 K  | `raw/100.0 - 273.15` → °C |
