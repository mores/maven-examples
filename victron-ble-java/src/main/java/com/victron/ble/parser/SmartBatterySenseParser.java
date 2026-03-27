package com.victron.ble.parser;

import com.victron.ble.model.SmartBatterySenseData;
import com.victron.ble.model.VictronAdvertisement;

/**
 * Parses a decrypted Victron Smart Battery Sense payload.
 *
 * BatterySense extends BatteryMonitor, which uses BitReader to parse
 * bit-packed fields LSB to MSB:
 *
 *   Bits  0-15 : remaining_mins     (uint16)
 *   Bits 16-31 : voltage            (int16,  unit = 10mV,   0x7FFF = N/A)
 *   Bits 32-47 : alarm              (uint16)
 *   Bits 48-63 : aux value          (uint16, meaning depends on aux_mode)
 *   Bits 64-65 : aux_mode           (uint2,  2 = TEMPERATURE)
 *   Bits 66-87 : current            (int22,  unit = mA,     0x3FFFFF = N/A)
 *   Bits 88-107: consumed_ah        (uint20, unit = 0.1Ah,  0xFFFFF = N/A)
 *   Bits 108-117: soc               (uint10, unit = 0.1%,   0x3FF = N/A)
 *
 * When aux_mode == 2 (TEMPERATURE): aux / 100.0 = temperature in Kelvin
 */
public class SmartBatterySenseParser {

    private static final int AUX_MODE_TEMPERATURE = 2;

    private static final int PRODUCT_ID_SMART_BATTERY_SENSE      = 0xA3A4;
    private static final int PRODUCT_ID_SMART_BATTERY_SENSE_REV2 = 0xA3A5;

    private final VictronDecryptor decryptor;
    private final byte expectedKeyByte;

    public SmartBatterySenseParser(String advertisementKey) {
        this.decryptor       = new VictronDecryptor(advertisementKey);
        this.expectedKeyByte = hexToBytes(advertisementKey)[0];
    }

    public SmartBatterySenseData parse(String name, String address, int rssi,
                                        VictronAdvertisement advert) {
        // Validate key check byte
        if (advert.getKeyCheckByte() != expectedKeyByte) {
            System.err.printf("[WARN] Key mismatch: advert=0x%02X key[0]=0x%02X%n",
                advert.getKeyCheckByte() & 0xFF, expectedKeyByte & 0xFF);
            return null;
        }

        try {
            byte[] decrypted = decryptor.decrypt(advert);
            BitReader reader  = new BitReader(decrypted);

            // Read fields in order — must match Python BatteryMonitor.parse_decrypted exactly
            int remainingMins = reader.readUnsignedInt(16);
            int rawVoltage    = reader.readSignedInt(16);
            int alarm         = reader.readUnsignedInt(16);
            int aux           = reader.readUnsignedInt(16);
            int auxMode       = reader.readUnsignedInt(2);

            // Voltage: unit = 10mV, signed, 0x7FFF = N/A
            Double voltage = (rawVoltage != 0x7FFF) ? rawVoltage / 100.0 : null;

            // Temperature: aux / 100 = Kelvin, only valid when auxMode == 2
            Double temperatureCelsius = null;
            if (auxMode == AUX_MODE_TEMPERATURE && aux != 0xFFFF) {
                temperatureCelsius = (aux / 100.0) - 273.15;
            }

            String modelName = resolveModelName(advert.getProductId());
            return new SmartBatterySenseData(name, address, rssi, modelName,
                voltage, temperatureCelsius);

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
