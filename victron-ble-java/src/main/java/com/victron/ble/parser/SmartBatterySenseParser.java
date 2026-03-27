package com.victron.ble.parser;

import com.victron.ble.model.SmartBatterySenseData;
import com.victron.ble.model.VictronAdvertisement;

/**
 * Parses a decrypted Victron Smart Battery Sense payload.
 *
 * Smart Battery Sense decrypted payload layout (little-endian):
 *   Bytes 0-1 : voltage     in units of 10 mV  → voltage_V  = raw / 100.0
 *   Bytes 2-3 : temperature in units of 0.01 K → temp_C     = (raw / 100.0) - 273.15
 */
public class SmartBatterySenseParser {

    public static final int PRODUCT_ID_SMART_BATTERY_SENSE      = 0xA3A4;
    public static final int PRODUCT_ID_SMART_BATTERY_SENSE_REV2 = 0xA3A5;

    private final VictronDecryptor decryptor;
    private final byte expectedKeyByte;

    public SmartBatterySenseParser(String advertisementKey) {
        this.decryptor = new VictronDecryptor(advertisementKey);
        // First byte of the key is broadcast in the advertisement for validation
        this.expectedKeyByte = hexToBytes(advertisementKey)[0];
    }

    public SmartBatterySenseData parse(String name, String address, int rssi,
                                        VictronAdvertisement advert) {
        // Validate key check byte — if wrong, we'll decrypt garbage
        byte keyCheck = advert.getKeyCheckByte();
        if (keyCheck != expectedKeyByte) {
            System.err.printf("[WARN] Key mismatch: advertisement has 0x%02X, our key starts with 0x%02X%n",
                keyCheck & 0xFF, expectedKeyByte & 0xFF);
            return null;
        }

        try {
            byte[] decrypted = decryptor.decrypt(advert);

            if (decrypted.length < 4) {
                System.err.println("[WARN] Decrypted payload too short: " + decrypted.length + " bytes");
                return null;
            }

            // Voltage: bytes 0-1, little-endian uint16, unit = 10 mV
            int rawVoltage = ((decrypted[1] & 0xFF) << 8) | (decrypted[0] & 0xFF);
            double voltage = rawVoltage / 100.0;

            // Temperature: bytes 2-3, little-endian uint16, unit = 0.01 K
            int rawTemp = ((decrypted[3] & 0xFF) << 8) | (decrypted[2] & 0xFF);
            double temperatureCelsius = (rawTemp / 100.0) - 273.15;

            String modelName = resolveModelName(advert.getProductId());

            return new SmartBatterySenseData(name, address, rssi, modelName, voltage, temperatureCelsius);

        } catch (Exception e) {
            System.err.println("[ERROR] Failed to decrypt/parse: " + e.getMessage());
            return null;
        }
    }

    private static String resolveModelName(int productId) {
        switch (productId) {
            case PRODUCT_ID_SMART_BATTERY_SENSE:      return "Smart Battery Sense";
            case PRODUCT_ID_SMART_BATTERY_SENSE_REV2: return "Smart Battery Sense (Rev2)";
            default: return String.format("Unknown Victron device (0x%04X)", productId);
        }
    }

    private static byte[] hexToBytes(String hex) {
        hex = hex.trim().toLowerCase().replaceAll("[^0-9a-f]", "");
        byte[] result = new byte[hex.length() / 2];
        for (int i = 0; i < result.length; i++)
            result[i] = (byte) Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);
        return result;
    }
}
