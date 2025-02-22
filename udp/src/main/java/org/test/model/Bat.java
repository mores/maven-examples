package org.test.model;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import org.test.Pixel;

public class Bat implements Show
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Bat.class);

	private static final int SIZE = 25;

	private String id;
	private boolean motion;
	private int start;

	private java.util.List<Pixel> eyeQueue;
	private java.util.List<Pixel> eyeTemplate;

	public Bat(String id, int start, int delay)
	{
		this.id = id;
		this.start = start;

		java.util.List<Pixel> up = org.test.Utils.getFadeUp( Pixel.RED, 50 );
                java.util.List<Pixel> down = org.test.Utils.getFadeDown( Pixel.RED, 50 );

		eyeTemplate = new java.util.ArrayList<>();
		eyeTemplate.addAll( up );
		eyeTemplate.addAll( down );

		eyeQueue = new java.util.ArrayList<>( eyeTemplate ).subList( delay, eyeTemplate.size() );
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

		Pixel eyeColor = eyeQueue.remove( 0 );
		if( eyeQueue.size() == 0 )
		{
			eyeQueue = new java.util.ArrayList<>( eyeTemplate );
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
				// EYES
				if( x == 0 )
				{
					pixel = eyeColor;
				}
				if( x == SIZE -1 )
				{
					pixel = eyeColor;
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
