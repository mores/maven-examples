package com.victron.ble.rrd;

import com.victron.ble.model.SmartBatterySenseData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Updates an rrdtool database with Victron Smart Battery Sense readings.
 *
 * Create the RRD first:
 *   rrdtool create victron.rrd \
 *     --step 10 \
 *     DS:voltage:GAUGE:30:0:30 \
 *     DS:temperature:GAUGE:30:-50:100 \
 *     RRA:AVERAGE:0.5:1:8640 \
 *     RRA:AVERAGE:0.5:6:8640 \
 *     RRA:AVERAGE:0.5:36:8760 \
 *     RRA:MAX:0.5:1:8640 \
 *     RRA:MIN:0.5:1:8640
 */
public class RrdUpdater {

    private final String rrdPath;
    private final String rrdtoolBin;

    public RrdUpdater(String rrdPath, String rrdtoolBin) {
        this.rrdPath    = rrdPath;
        this.rrdtoolBin = rrdtoolBin;
    }

    public RrdUpdater(String rrdPath) {
        this(rrdPath, findRrdtool());
    }

    /**
     * Update the RRD with a new reading.
     * Uses "N" (now) so rrdtool fills in the current epoch second.
     */
    public void update(SmartBatterySenseData data) {
        Double voltage = data.getVoltage();
        Double temp    = data.getTemperatureCelsius();

        // rrdtool uses "U" for unknown/N/A values
        String v = voltage != null ? String.format("%.2f", voltage) : "U";
        String t = temp    != null ? String.format("%.2f", temp)    : "U";

        runRrd("update", rrdPath, "N:" + v + ":" + t);
    }

    /**
     * Generate a PNG graph of the last 24 hours.
     */
    public void graphLast24h(String outputPng) {
        long end   = System.currentTimeMillis() / 1000;
        long start = end - 86400;

        runRrd(
            "graph",  outputPng,
            "--start",  String.valueOf(start),
            "--end",    String.valueOf(end),
            "--title",  "Victron Smart Battery Sense - Last 24h",
            "--width",  "800",
            "--height", "300",
            "--vertical-label", "Volts / Celsius",

            "DEF:voltage=" + rrdPath + ":voltage:AVERAGE",
            "LINE2:voltage#0000FF:Voltage (V)",
            "GPRINT:voltage:LAST:  Last\\: %5.2lf V",
            "GPRINT:voltage:MIN:   Min\\: %5.2lf V",
            "GPRINT:voltage:MAX:   Max\\: %5.2lf V\\n",

            "DEF:temp=" + rrdPath + ":temperature:AVERAGE",
            "LINE2:temp#FF0000:Temperature (C)",
            "GPRINT:temp:LAST:  Last\\: %5.2lf C",
            "GPRINT:temp:MIN:   Min\\: %5.2lf C",
            "GPRINT:temp:MAX:   Max\\: %5.2lf C\\n"
        );
    }

    // -------------------------------------------------------------------------

    private void runRrd(String... args) {
        String[] cmd = new String[args.length + 1];
        cmd[0] = rrdtoolBin;
        System.arraycopy(args, 0, cmd, 1, args.length);

        try {
            ProcessBuilder pb = new ProcessBuilder(cmd);
            pb.redirectErrorStream(true);
            Process proc = pb.start();
            int exit = proc.waitFor();
            if (exit != 0) {
                String err = new String(proc.getInputStream().readAllBytes()).trim();
                System.err.println("[RRD] rrdtool " + args[0] + " failed (exit " + exit + "): " + err);
            } else if (args[0].equals("graph")) {
                System.out.println("[RRD] Graph written to " + args[1]);
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("[RRD] Error running rrdtool: " + e.getMessage());
        }
    }

    private static String findRrdtool() {
        String[] candidates = {
            "/usr/bin/rrdtool",
            "/usr/local/bin/rrdtool",
            "/opt/homebrew/bin/rrdtool"    // macOS Homebrew (Apple Silicon)
        };
        for (String path : candidates) {
            if (Files.exists(Paths.get(path))) return path;
        }
        return "rrdtool";  // fall back to PATH
    }
}
