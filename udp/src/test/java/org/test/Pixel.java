package org.test;

public class Pixel
{
	private byte red;
	private byte green;
	private byte blue;

	public Pixel()
	{
		red = 0x7F;
		green = 0x7F;
		blue = 0x7F;
	}

	public byte getRed()
	{
		return red;
	}

	public void setRed( byte red )
	{
		this.red = red;
	}

	public byte getGreen()
        {
                return green;
        }

        public void setGreen( byte green )
        {
                this.green = green;
        }

	public byte getBlue()
        {
                return blue;
        }

        public void setBlue( byte blue )
        {
                this.blue = blue;
        }

	// binary

	public void on()
        {
                red = 0x7F;
                green = 0x7F;
                blue = 0x7F;
        }

        public void off()
        {
                red = 0x00;
                green = 0x00;
                blue = 0x00;
        }

	// colors

	public void blue()
	{
		red = 0x00;
                green = 0x00;
                blue = 0x7F;
	}

	public void cyan()
	{
		red = 0x00;
                green = 0x7F;
                blue = 0x7F;
	}

	public void green()
        {
                red = 0x00;
                green = 0x7F;
                blue = 0x00;
        }

	public void magenta()
	{
		red = 0x7F;
		green = 0x00;
                blue = 0x7F;
	}

	public void red()
	{
		red = 0x7F;
		green = 0x00;
                blue = 0x00;
	}

	public void yellow()
	{
		red = 0x7F;
		green = 0x7F;
		blue = 0x00;
	}

	//

	public byte[] getRGB()
	{
		byte[] data = new byte[3];
		data[0] = red;
		data[1] = green;
		data[2] = blue;

		return data;
	}
}
