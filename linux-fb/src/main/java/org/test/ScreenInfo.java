package org.test;

@com.sun.jna.Structure.FieldOrder({ "xres", "yres", "xres_virtual", "yres_virtual", "xoffset", "yoffset", "bits_per_pixel", "grayscale", "red", "green", "blue", "transp", "nonstd", "activate", "height", "width", "accel_flags", "pixclock", "left_margin", "right_margin", "upper_margin", "lower_margin", "hsync_len", "vsync_len", "sync", "vmode", "rotate", "colorspace", "reserved"  })
public class ScreenInfo extends com.sun.jna.Structure
{
	public int xres;
        public int yres;
	public int xres_virtual;
	public int yres_virtual;
	public int xoffset;
	public int yoffset;
	public int bits_per_pixel;
	public int grayscale;

	public BitField red;
	public BitField green;
	public BitField blue;
	public BitField transp;

	public int nonstd;
	public int activate;
	public int height;
	public int width;
	public int accel_flags;
	public int pixclock;
	public int left_margin;
	public int right_margin;
	public int upper_margin;
	public int lower_margin;
	public int hsync_len;
	public int vsync_len;
	public int sync;
	public int vmode;
	public int rotate;
	public int colorspace;
	public int reserved;
}
