package org.test;

@com.sun.jna.Structure.FieldOrder({ "offset", "length", "msb_right" })
public class BitField extends com.sun.jna.Structure
{
	public short offset;
        public short length;
	public short msb_right;
}
