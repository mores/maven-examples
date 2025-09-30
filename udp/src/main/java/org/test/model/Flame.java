package org.test.model;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import org.test.Pixel;

public class Flame implements Show
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Flame.class);

	private static final int SIZE = 10;

	private String id;
	private boolean motion;
	private int start;

	private java.awt.Color[] flameColors;

	public Flame(String id, int start )
	{
		this.id = id;
		this.start = start;

		flameColors = new java.awt.Color[4];
		flameColors[0] = new java.awt.Color(255, 40, 0);     // deep red
		flameColors[1] = new java.awt.Color(255, 100, 0);    // orange
	        flameColors[2] = new java.awt.Color(255, 180, 30);   // yellow-orange
		flameColors[3] = new java.awt.Color(255, 255, 180);   // pale yellow-white
		
	}

	private java.awt.Color getRandomFlameColor() {

		java.util.Random random = new java.util.Random();

		// Pick a base color from the palette
		java.awt.Color base = flameColors[random.nextInt(flameColors.length)];

		// Apply flicker by scaling brightness randomly
		float flicker = 0.5f + random.nextFloat() * 0.7f; // 0.5–1.2 range

		int r = Math.min(255, (int)(base.getRed()   * flicker));
		int g = Math.min(255, (int)(base.getGreen() * flicker));
		int b = Math.min(255, (int)(base.getBlue()  * flicker));

		return new java.awt.Color(r, g, b);
    	}

	@Override
        public int getSize()
        {
                return SIZE;
        }

	@Override
	public int getStart()
	{
		return start;
	}

	@Override
	public java.util.List<Pixel> getPixels( long sequence )
	{
		//log.info( id + " seq: " + sequence );
		java.util.List<Pixel> pixels = new java.util.ArrayList<>();

		for( int x = 0; x < SIZE; x++ )
		{
			Pixel pixel = new Pixel( getRandomFlameColor() );
                        pixels.add( pixel );
		}

		return pixels;
	}

	@Subscribe(threadMode = ThreadMode.MAIN)
        public void onMotion( org.test.MotionEvent event )
        {
                log.info( "onMotion" );
		motion = true;
        }
}
