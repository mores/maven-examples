package com.victron.ble.parser;

import com.victron.ble.model.VictronAdvertisement;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Decrypts a Victron BLE advertisement payload using AES-128-CTR.
 *
 * The encryption scheme (documented by Victron):
 *   - Algorithm : AES-128 in CTR mode
 *   - Key       : 16-byte per-device advertisement key (from VictronConnect app)
 *   - IV        : bytes 5-6 of manufacturer data (little-endian uint16),
 *                 zero-padded to 16 bytes
 *   - Input     : bytes 8+ of manufacturer data
 */
public class VictronDecryptor {

    private final byte[] keyBytes;

    /**
     * @param hexKey 32-character hex string from VictronConnect "Instant Readout Details"
     */
    public VictronDecryptor(String hexKey) {
        this.keyBytes = hexToBytes(hexKey);
        if (this.keyBytes.length != 16) {
            throw new IllegalArgumentException(
                "Advertisement key must be 16 bytes (32 hex chars), got " + this.keyBytes.length);
        }
    }

    /**
     * Decrypt the payload in the given advertisement.
     *
     * @return decrypted bytes
     * @throws Exception on crypto failure
     */
    public byte[] decrypt(VictronAdvertisement advert) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(advert.getIV());

        // Java's "AES/CTR/NoPadding" is equivalent to OpenSSL's EVP_aes_128_ctr
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);

        return cipher.doFinal(advert.getEncryptedPayload());
    }

    // -------------------------------------------------------------------------

    private static byte[] hexToBytes(String hex) {
        hex = hex.trim().toLowerCase().replaceAll("[^0-9a-f]", "");
        if (hex.length() % 2 != 0) hex = "0" + hex;
        byte[] result = new byte[hex.length() / 2];
        for (int i = 0; i < result.length; i++) {
            result[i] = (byte) Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);
        }
        return result;
    }
}
