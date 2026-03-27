package com.victron.ble;

import com.victron.ble.rrd.RrdUpdater;
import com.victron.ble.scanner.VictronScanner;

/**
 * Victron BLE Reader
 *
 * Usage:
 *   # Discover nearby Victron devices:
 *   java -jar victron-ble.jar discover
 *
 *   # Read and print JSON:
 *   java -jar victron-ble.jar read MAC@KEY [duration_seconds]
 *
 *   # Read and update an rrdtool database:
 *   java -jar victron-ble.jar rrd MAC@KEY /path/to/victron.rrd [duration_seconds]
 *
 *   # Generate a graph from an existing rrd:
 *   java -jar victron-ble.jar graph /path/to/victron.rrd /path/to/output.png
 */
public class Main {

    public static void main(String[] args) throws Exception {
        if (args.length < 1) { printUsage(); System.exit(1); }

        switch (args[0].toLowerCase()) {

            case "discover": {
                int duration = args.length >= 2 ? Integer.parseInt(args[1]) : 30;
                new VictronScanner().scan(data -> {}, duration);
                break;
            }

            case "read": {
                if (args.length < 2) { printUsage(); System.exit(1); }
                String[] parts = splitTarget(args[1]);
                int duration = args.length >= 3 ? Integer.parseInt(args[2]) : 30;
                new VictronScanner(parts[0], parts[1])
                    .scan(data -> System.out.println(data), duration);
                break;
            }

            case "rrd": {
                if (args.length < 3) { printUsage(); System.exit(1); }
                String[] parts   = splitTarget(args[1]);
                String   rrdPath = args[2];
                int      duration = args.length >= 4 ? Integer.parseInt(args[3]) : 0;
                RrdUpdater updater = new RrdUpdater(rrdPath);
                System.out.println("[INFO] Updating " + rrdPath + " continuously (Ctrl+C to stop)...");
                new VictronScanner(parts[0], parts[1])
                    .scan(data -> {
                        System.out.println(data);
                        updater.update(data);
                    }, duration);
                break;
            }

            case "graph": {
                if (args.length < 3) { printUsage(); System.exit(1); }
                new RrdUpdater(args[1]).graphLast24h(args[2]);
                break;
            }

            default:
                System.err.println("[ERROR] Unknown command: " + args[0]);
                printUsage();
                System.exit(1);
        }
    }

    private static String[] splitTarget(String target) {
        if (!target.contains("@")) {
            System.err.println("[ERROR] Argument must be MAC@KEY");
            System.exit(1);
        }
        return target.split("@", 2);
    }

    private static void printUsage() {
        System.out.println("Usage:");
        System.out.println("  victron-ble discover [duration_seconds]");
        System.out.println("  victron-ble read     MAC@KEY [duration_seconds]");
        System.out.println("  victron-ble rrd      MAC@KEY /path/to/victron.rrd [duration_seconds]");
        System.out.println("  victron-ble graph    /path/to/victron.rrd /path/to/output.png");
        System.out.println();
        System.out.println("Examples:");
        System.out.println("  java -jar victron-ble.jar read CD:C3:E4:90:B1:21@79baacb9de30b21acf351d077a16cd18");
        System.out.println("  java -jar victron-ble.jar rrd  CD:C3:E4:90:B1:21@79baacb9de30b21acf351d077a16cd18 /var/lib/rrd/victron.rrd");
        System.out.println("  java -jar victron-ble.jar graph /var/lib/rrd/victron.rrd /tmp/victron.png");
    }
}
