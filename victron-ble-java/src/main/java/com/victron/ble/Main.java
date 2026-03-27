package com.victron.ble;

import com.victron.ble.scanner.VictronScanner;

/**
 * Victron BLE Reader — Java port of https://github.com/keshavdv/victron-ble
 *
 * Usage:
 *   # Discover all nearby Victron devices (no key needed):
 *   java -jar victron-ble.jar discover
 *
 *   # Read + decrypt data from a specific device:
 *   java -jar victron-ble.jar read CD:C3:E4:90:B1:21@your32hexadvertisementkey
 *
 *   # Optionally pass scan duration in seconds (default = 30):
 *   java -jar victron-ble.jar read CD:C3:E4:90:B1:21@your32hexadvertisementkey 60
 */
public class Main {

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            printUsage();
            System.exit(1);
        }

        String command = args[0].toLowerCase();

        switch (command) {

            case "discover": {
                int duration = args.length >= 2 ? Integer.parseInt(args[1]) : 30;
                System.out.printf("[INFO] Scanning for Victron devices for %d seconds...%n", duration);
                VictronScanner scanner = new VictronScanner();
                scanner.scan(data -> {}, duration); // discover mode prints internally
                break;
            }

            case "read": {
                if (args.length < 2) {
                    System.err.println("[ERROR] 'read' requires MAC@KEY argument");
                    printUsage();
                    System.exit(1);
                }

                String target = args[1];
                if (!target.contains("@")) {
                    System.err.println("[ERROR] Argument must be in format MAC@KEY, e.g. CD:C3:E4:90:B1:21@0df4d...");
                    System.exit(1);
                }

                String[] parts = target.split("@", 2);
                String mac = parts[0].trim();
                String key = parts[1].trim();
                int duration = args.length >= 3 ? Integer.parseInt(args[2]) : 30;

                System.out.printf("[INFO] Reading data for [%s] for %d seconds...%n", mac, duration);
                VictronScanner scanner = new VictronScanner(mac, key);
                scanner.scan(data -> System.out.println(data), duration);
                break;
            }

            default:
                System.err.println("[ERROR] Unknown command: " + command);
                printUsage();
                System.exit(1);
        }
    }

    private static void printUsage() {
        System.out.println("Usage:");
        System.out.println("  victron-ble discover [duration_seconds]");
        System.out.println("  victron-ble read MAC@KEY [duration_seconds]");
        System.out.println();
        System.out.println("Examples:");
        System.out.println("  java -jar victron-ble.jar discover");
        System.out.println("  java -jar victron-ble.jar read CD:C3:E4:90:B1:21@0df4d0395b7d1a876c0c33ecb9e70dcd");
        System.out.println("  java -jar victron-ble.jar read CD:C3:E4:90:B1:21@0df4d0395b7d1a876c0c33ecb9e70dcd 60");
    }
}
