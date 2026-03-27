package com.victron.ble.model;

/**
 * Victron manufacturer advertisement data as returned by blessed-bluez.
 *
 * blessed strips the 2-byte company ID (0xE1 0x02) before handing us the bytes,
 * so our [0] corresponds to on-wire byte [2]:
 *
 *   On-wire:  E1 02 | 10 00 | A5 A3 | 02 | 6A 3E | 79 | AC B3 08 ...
 *              ^company^  ^flags^  ^prodID^  ^fl^  ^nonce^  ^key^ ^encrypted^
 *   Our index:            [0] [1]  [2] [3]  [4]  [5] [6]  [7]  [8+]
 *
 * Verified against raw bytes:
 *   10 00 A5 A3 02 6A 3E 79 AC B3 ...
 *   [0] [1][2][3][4][5][6][7][8+]
 *
 *   [0-1] = 10 00  flags / record type
 *   [2-3] = A5 A3  product ID little-endian = 0xA3A5 (Smart Battery Sense Rev2) ✓
 *   [4]   = 02     flags/TTL
 *   [5-6] = 6A 3E  nonce/IV — increments each advertisement ✓
 *   [7]   = 79     first byte of encryption key (key check byte)
 *   [8+]           AES-128-CTR encrypted payload
 */
public class VictronAdvertisement {

    public static final int VICTRON_MANUFACTURER_ID = 0x02E1;

    private final byte[] raw;

    public VictronAdvertisement(byte[] manufacturerData) {
        this.raw = manufacturerData;
    }

    /** Bytes 2-3 little-endian: Victron product ID */
    public int getProductId() {
        return ((raw[3] & 0xFF) << 8) | (raw[2] & 0xFF);
    }

    /** Low nibble of byte 0: record type */
    public int getRecordType() {
        return raw[0] & 0x0F;
    }

    /**
     * Bytes 5-6: nonce/IV (little-endian uint16), zero-padded to 16 bytes for AES-CTR.
     */
    public byte[] getIV() {
        byte[] iv = new byte[16];
        iv[0] = raw[5];
        iv[1] = raw[6];
        return iv;
    }

    /** Byte 7: first byte of encryption key — used to validate key is correct */
    public byte getKeyCheckByte() {
        return raw[7];
    }

    /** Bytes 8+: AES-128-CTR encrypted payload */
    public byte[] getEncryptedPayload() {
        int start = 8;
        int len = raw.length - start;
        if (len <= 0) return new byte[0];
        byte[] payload = new byte[len];
        System.arraycopy(raw, start, payload, 0, len);
        return payload;
    }

    public byte[] getRaw() { return raw; }
}
