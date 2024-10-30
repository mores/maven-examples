package org.test;

public class Frame
{
	private java.util.List<Pixel> pixels;

	public java.util.List<Pixel> getPixels()
	{
		return pixels;
	}

	public void setPixels( java.util.List<Pixel> pixels )
	{
		this.pixels = pixels;
	}

	public byte[] getData()
	{
		byte[] data = new byte[0];
                for( Pixel pixel : pixels )
                {
                        data = org.apache.commons.lang3.ArrayUtils.addAll( data, pixel.getRGB() );
                }

                return data;
	}
}
