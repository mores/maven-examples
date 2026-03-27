package com.victron.ble.parser;

/**
 * Reads bit-field structures packed LSB to MSB, exactly matching
 * victron-ble's Python BitReader class.
 */
public class BitReader {
    private final byte[] data;
    private int index = 0;

    public BitReader(byte[] data) {
        this.data = data;
    }

    public int readBit() {
        int bit = (data[index >> 3] >> (index & 7)) & 1;
        index++;
        return bit;
    }

    public int readUnsignedInt(int numBits) {
        int value = 0;
        for (int position = 0; position < numBits; position++) {
            value |= readBit() << position;
        }
        return value;
    }

    public int readSignedInt(int numBits) {
        return toSignedInt(readUnsignedInt(numBits), numBits);
    }

    public static int toSignedInt(int value, int numBits) {
        return ((value & (1 << (numBits - 1))) != 0) ? value - (1 << numBits) : value;
    }
}
