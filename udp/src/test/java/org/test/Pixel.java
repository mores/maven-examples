package org.test;

/*
	Java byte 8-bit signed -128 -> 127
	we want to work with 0 -> 255

	How much different is this from java.awt.Color ??
*/

public class Pixel
{
	private float brightness;

	private short red;
	private short green;
	private short blue;

	public Pixel()
	{
		brightness = 1.0f;

		red = 255;
		green = 255;
		blue = 255;
	}

	public float getBrightness()
	{
		return brightness;
	}

	public void setBrightness( Float bright )
	{
		if( bright.compareTo( 1.0f ) > 0 )
		{
			brightness = 1.0f;
		}
		else if( bright.compareTo( 0.0f ) < 0 )
		{
			brightness = 0.0f;
		}
		else
		{
			this.brightness = bright;
		}
	}

	public short getRed()
	{
		return red;
	}

	public void setRed( short red )
	{
		this.red = red;
	}

	public short getGreen()
        {
                return green;
        }

        public void setGreen( short green )
        {
                this.green = green;
        }

	public short getBlue()
        {
                return blue;
        }

        public void setBlue( short blue )
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
		red = 240;
		green = 255;
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
		red = 223;
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
		red = (short)java.awt.Color.ORANGE.getRed();
		green = (short)java.awt.Color.ORANGE.getGreen();
		blue = (short)java.awt.Color.ORANGE.getBlue();
	}

	public void pink()
	{
		red = (short)java.awt.Color.PINK.getRed();
                green = (short)java.awt.Color.PINK.getGreen();
                blue = (short)java.awt.Color.PINK.getBlue();
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
		blue = 127;
	}

	public void violet()
	{
		red = 127;
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
		data[0] = (byte)(short)(red * brightness);
		data[1] = (byte)(short)(green * brightness);
		data[2] = (byte)(short)(blue * brightness);

		return data;
	}
}
