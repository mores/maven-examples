package com.victron.ble.parser;

import com.victron.ble.model.VictronAdvertisement;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * Decrypts a Victron BLE advertisement payload.
 *
 * Python victron-ble uses:
 *   ctr = Counter.new(128, initial_value=iv_int, little_endian=True)
 *   cipher = AES.new(key, AES.MODE_CTR, counter=ctr)
 *   plaintext = cipher.decrypt(pad(ciphertext, 16))
 *
 * With little_endian=True and a short payload, pycryptodome's CTR mode
 * encrypts the IV block as-is (little-endian byte order) and XORs it
 * with the ciphertext. This is equivalent to:
 *
 *   iv_bytes = iv_int.to_bytes(16, 'little')   # e.g. C2 AB 00 00 ... 00
 *   keystream = AES_ECB_encrypt(key, iv_bytes)
 *   plaintext = ciphertext XOR keystream
 *
 * Java's AES/CTR/NoPadding uses big-endian counter so we implement
 * it manually with AES/ECB/NoPadding instead.
 */
public class VictronDecryptor {

    private final SecretKeySpec keySpec;

    public VictronDecryptor(String hexKey) {
        byte[] keyBytes = hexToBytes(hexKey);
        if (keyBytes.length != 16)
            throw new IllegalArgumentException("Key must be 16 bytes, got " + keyBytes.length);
        this.keySpec = new SecretKeySpec(keyBytes, "AES");
    }

    public byte[] decrypt(VictronAdvertisement advert) throws Exception {
        // IV: nonce as little-endian 16-byte block
        // e.g. nonce bytes C2 AB -> iv = 0xABC2 -> to_bytes(16,'little') = C2 AB 00 00 ... 00
        byte[] iv         = advert.getIV();   // already built as [nonce_lo, nonce_hi, 0...0]
        byte[] ciphertext = advert.getEncryptedPayload();

        // Pad ciphertext to 16 bytes (matching Python's pad(ciphertext, 16))
        byte[] padded = new byte[16];
        System.arraycopy(ciphertext, 0, padded, 0, Math.min(ciphertext.length, 16));

        // Generate keystream by AES-ECB encrypting the IV block
        Cipher ecb = Cipher.getInstance("AES/ECB/NoPadding");
        ecb.init(Cipher.ENCRYPT_MODE, keySpec);
        byte[] keystream = ecb.doFinal(iv);

        // XOR to decrypt
        byte[] plaintext = new byte[padded.length];
        for (int i = 0; i < padded.length; i++)
            plaintext[i] = (byte) (padded[i] ^ keystream[i]);

        return plaintext;
    }

    private static byte[] hexToBytes(String hex) {
        hex = hex.trim().toLowerCase().replaceAll("[^0-9a-f]", "");
        if (hex.length() % 2 != 0) hex = "0" + hex;
        byte[] b = new byte[hex.length() / 2];
        for (int i = 0; i < b.length; i++)
            b[i] = (byte) Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);
        return b;
    }
}
