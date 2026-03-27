package com.victron.ble.model;

/**
 * Parsed payload from a Victron Smart Battery Sense advertisement.
 *
 * Protocol layout (after AES-128-CTR decryption, little-endian):
 *   Bytes 0-1  : voltage in 10 mV units  → divide by 100 for volts
 *   Bytes 2-3  : temperature in 0.01 K units → subtract 273.15 for °C
 */
public class SmartBatterySenseData {

    private final String name;
    private final String address;
    private final int rssi;
    private final String modelName;
    private final double voltage;
    private final double temperatureCelsius;

    public SmartBatterySenseData(String name, String address, int rssi,
                                  String modelName, double voltage, double temperatureCelsius) {
        this.name = name;
        this.address = address;
        this.rssi = rssi;
        this.modelName = modelName;
        this.voltage = voltage;
        this.temperatureCelsius = temperatureCelsius;
    }

    public String getName()              { return name; }
    public String getAddress()           { return address; }
    public int getRssi()                 { return rssi; }
    public String getModelName()         { return modelName; }
    public double getVoltage()           { return voltage; }
    public double getTemperatureCelsius(){ return temperatureCelsius; }

    @Override
    public String toString() {
        return String.format(
            "{\"name\":\"%s\",\"address\":\"%s\",\"rssi\":%d," +
            "\"payload\":{\"model_name\":\"%s\",\"voltage\":%.2f,\"temperature\":%.2f}}",
            name, address, rssi, modelName, voltage, temperatureCelsius);
    }
}
