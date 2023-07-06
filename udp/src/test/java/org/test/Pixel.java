package org.test;

/*
	Java byte 8-bit signed -128 -> 127
	we want to work with 0 -> 255

	How much different is this from java.awt.Color ??
*/

public class Pixel
{
	private float brightness;

	private int red;
	private int green;
	private int blue;

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
		red = java.awt.Color.ORANGE.getRed();
		green = java.awt.Color.ORANGE.getGreen();
		blue = java.awt.Color.ORANGE.getBlue();
	}

	public void pink()
	{
		red = java.awt.Color.PINK.getRed();
                green = java.awt.Color.PINK.getGreen();
                blue = java.awt.Color.PINK.getBlue();
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
		data[0] = (byte)(int)(red * brightness);
		data[1] = (byte)(int)(green * brightness);
		data[2] = (byte)(int)(blue * brightness);

		return data;
	}
}
