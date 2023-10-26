package org.test;

public class Transition
{
	private int brightness;
	private int color_temp;
	private int hue;
	private int ignore_default = 1;
	private int on_off;
	private int saturation;
	private int transition_period;

	public Transition( Pixel pixel )
	{
		if( pixel != null )
		{
			int[] hsv = pixel.getHsv();
			hue = hsv[0];
			saturation = hsv[1];
			brightness = hsv[2];
			on_off = 1;
		}
	}
}
