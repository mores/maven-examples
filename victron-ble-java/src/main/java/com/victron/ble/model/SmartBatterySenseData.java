package com.victron.ble.model;

import java.time.Instant;

/**
 * Parsed payload from a Victron Smart Battery Sense advertisement.
 * Voltage and temperature are nullable — N/A values from the device are null.
 */
public class SmartBatterySenseData {

    private final Instant timestamp;
    private final String name;
    private final String address;
    private final int rssi;
    private final String modelName;
    private final Double voltage;
    private final Double temperatureCelsius;

    public SmartBatterySenseData(String name, String address, int rssi,
                                  String modelName, Double voltage, Double temperatureCelsius) {
        this.timestamp          = Instant.now();
        this.name               = name;
        this.address            = address;
        this.rssi               = rssi;
        this.modelName          = modelName;
        this.voltage            = voltage;
        this.temperatureCelsius = temperatureCelsius;
    }

    public Instant getTimestamp()         { return timestamp; }
    public String getName()               { return name; }
    public String getAddress()            { return address; }
    public int getRssi()                  { return rssi; }
    public String getModelName()          { return modelName; }
    public Double getVoltage()            { return voltage; }
    public Double getTemperatureCelsius() { return temperatureCelsius; }

    @Override
    public String toString() {
        String v = voltage            != null ? String.format("%.2f", voltage)            : "null";
        String t = temperatureCelsius != null ? String.format("%.2f", temperatureCelsius) : "null";
        return String.format(
            "{\"timestamp\":\"%s\",\"name\":\"%s\",\"address\":\"%s\",\"rssi\":%d," +
            "\"payload\":{\"model_name\":\"%s\",\"voltage\":%s,\"temperature\":%s}}",
            timestamp, name, address, rssi, modelName, v, t);
    }
}
