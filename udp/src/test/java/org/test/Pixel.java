package org.test;

/*
	Java byte 8-bit signed -128 -> 127
	we want to work with 0 -> 255
*/

public class Pixel
{
	private int red;
	private int green;
	private int blue;

	public Pixel()
	{
		red = 255;
		green = 255;
		blue = 255;
	}

	public int getRed()
	{
		return red;
	}

	public void setRed( int red )
	{
		this.red = red;
	}

	public int getGreen()
        {
                return green;
        }

        public void setGreen( int green )
        {
                this.green = green;
        }

	public int getBlue()
        {
                return blue;
        }

        public void setBlue( int blue )
        {
                this.blue = blue;
        }

	// binary
	public void on()
        {
                red = 255;
                green = 255;
                blue = 255;
        }

        public void off()
        {
                red = 0;
                green = 0;
                blue = 0;
        }

	// colors
	public void azure()
	{
		red = 0;
		green = 165;
		blue = 255;
	}

	public void blue()
	{
		red = 0;
                green = 0;
                blue = 255;
	}

	public void chartreuse()
	{
		red = 165;
		green = 255;
		blue = 0;
	}

	public void cyan()
	{
		red = 0;
                green = 255;
                blue = 255;
	}

	public void green()
        {
                red = 0;
                green = 255;
                blue = 0;
        }

	public void magenta()
	{
		red = 255;
		green = 0;
                blue = 255;
	}

	public void orange()
	{
		// 100% red + 64.7% green
		red = 255;
                green = 165;
                blue = 0;
	}

	public void pink()
	{
		red = 255;
		green = 0;
		blue = 165;
	}

	public void red()
	{
		red = 255;
		green = 0;
                blue = 0;
	}

	public void springGreen()
	{
		red = 0;
		green = 255;
		blue = 165;
	}

	public void violet()
	{
		red = 165;
		green = 0;
		blue = 255;
	}

	public void yellow()
	{
		red = 255;
		green = 255;
		blue = 0;
	}

	//

	public byte[] getRGB()
	{
		byte[] data = new byte[3];
		data[0] = (byte)red;
		data[1] = (byte)green;
		data[2] = (byte)blue;

		return data;
	}
}
