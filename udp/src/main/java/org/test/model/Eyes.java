package org.test.model;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import org.test.Pixel;

public class Eyes implements Show
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Eyes.class);

	private java.util.Random random;

	private static final int SIZE = 4;

	private boolean blinking;
	private int blinkTemplate = 10;
	private int blinkDuration = 0;
	private int nextBlink = 0;

	private Pixel color;
	private String id;
	private boolean motion;
	private int start;

	public Eyes(String id, int start, Pixel color )
	{
		this.id = id;
		this.start = start;
		this.color = color;

		random = new java.util.Random();
		blinkTemplate = random.nextInt(10 - 1 + 1) + 1;

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

		if( nextBlink == 0 )
		{
			blinking = true;
		}
		nextBlink = nextBlink - 1;

		if( blinkDuration == 0 )
		{
			blinking = false;
			blinkDuration = blinkTemplate;
			nextBlink = random.nextInt(200 - 1 + 100) + 100;
		}

		if( blinking )
		{
			blinkDuration = blinkDuration - 1;
		}

		for( int x = 0; x < SIZE; x++ )
		{
			Pixel pixel = new Pixel();
                        pixel.off();

			if( motion )
			{

			}
			else
			{
				if( ! blinking ) 
				{
					pixel = color;
				}
				
			}

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
