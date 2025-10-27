package org.test.model;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import org.test.Pixel;

public class Bat implements Show
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Bat.class);

	private static final int SIZE = 50;

	private String id;
	private boolean motion;
	private int motionCounter;
	private int start;

	private java.util.List<Pixel> eyeQueue;
	private java.util.List<Pixel> eyeTemplate;

	private java.util.List<Pixel> wingQueue;
	private java.util.List<Pixel> wingTemplate;

	public Bat(String id, int start, int delay)
	{
		this.id = id;
		this.start = start;

		// eyes
		java.util.List<Pixel> up = org.test.Utils.getFadeUp( Pixel.RED, 100, 0.50f );
                java.util.List<Pixel> down = org.test.Utils.getFadeDown( Pixel.RED, 100, 0.50f );

		eyeTemplate = new java.util.ArrayList<>();
		eyeTemplate.addAll( up );
		eyeTemplate.addAll( down );

		eyeQueue = new java.util.ArrayList<>( eyeTemplate ).subList( delay, eyeTemplate.size() );

		// wings
		java.util.List<Pixel> wingUp = org.test.Utils.getFadeUp( Pixel.MAGENTA, 25 );
                java.util.List<Pixel> wingDown = org.test.Utils.getFadeDown( Pixel.MAGENTA, 25 );
	
		wingTemplate = new java.util.ArrayList<>();
		wingTemplate.addAll( wingUp );
		wingTemplate.addAll( wingDown );	

		int wingDelay = delay;
		if( wingDelay > wingTemplate.size() )
		{
			wingDelay = wingTemplate.size() - 1;
		}

		wingQueue = new java.util.ArrayList<>( wingTemplate ).subList( wingDelay, wingTemplate.size() );
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

		Pixel wingColor = wingQueue.remove( 0 );
		if( wingQueue.size() == 0 )
		{
			wingQueue =  new java.util.ArrayList<>( wingTemplate );
			if( motion )
			{
				motionCounter = motionCounter + 1;
			}

			if( motionCounter > 10 )
			{
				motion = false;
			}
		}

		for( int x = 0; x < SIZE; x++ )
		{
			Pixel pixel = new Pixel();
                        pixel.off();

			if( motion )
			{
				if( x == 0 )
				{
					pixel = Pixel.RED;
				}

				if( x > 0 && x < SIZE -1 )
				{
					pixel = wingColor;
				}

				if( x == SIZE -1 )
                                {       
                                        pixel = Pixel.RED;
                                }
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
