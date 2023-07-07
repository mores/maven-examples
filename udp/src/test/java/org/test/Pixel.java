package org.test;

/*
	Java byte 8-bit signed -128 -> 127
	we want to work with 0 -> 255

	How much different is this from java.awt.Color ??
	How much different is this from javafx.scene.paint.Color ??
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

	public Pixel( Pixel template )
	{
		brightness = 1.0f;

                this.red = template.getRed();
                this.green = template.getGreen();
                this.blue = template.getBlue();
	}
 
	public Pixel( int red, int green, int blue )
	{
		brightness = 1.0f;

		this.red = (short)red;
                this.green = (short)green;
                this.blue = (short)blue;
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
	public static final Pixel AZURE = new Pixel( 240, 255, 255 );
	public static final Pixel BLUE = new Pixel( 0, 0, 255 );
	public static final Pixel CHARTREUSE = new Pixel( 233, 255, 0 );
	public static final Pixel CYAN = new Pixel( 0, 255, 255 );
	public static final Pixel GREEN = new Pixel( 0, 255, 0 );
	public static final Pixel MAGENTA = new Pixel( 255, 0, 255 );
	public static final Pixel ORANGE = new Pixel( 255, 255, 0 );
	public static final Pixel PINK = new Pixel( 255, 200, 0 );
	public static final Pixel RED = new Pixel( 255, 0, 0 );
	public static final Pixel SPRING_GREEN = new Pixel( 0, 255, 127 );
	public static final Pixel VIOLET = new Pixel( 127, 0, 255 );
	public static final Pixel YELLOW = new Pixel( 255, 255, 0 );

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
