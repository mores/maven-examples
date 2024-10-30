package org.test;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class App {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(App.class);

	private String[] args;

	private int numberOfPixels = 100;
        private int numberOfChannels = 3;
        private int dataPoints = numberOfPixels * numberOfChannels;

	private boolean motion;

	public static void main(String[] args) throws Exception {

		new App(args).run();
	}

	public App(String[] args) {
		this.args = args;

		EventBus.getDefault().register(this);
	}

	public void run() throws Exception {
		log.info("Running");

		Server server = new Server();
		log.info("Start Server" );

		while( 1 == 1 )
		{
			if( motion )
			{
				flap();
				motion = false;
			}
			else
			{
				blinky();
			}
		}
	}

	@Subscribe(threadMode = ThreadMode.MAIN)
	public void onMotion( MotionEvent event )
	{
		log.info( "onMotion" );
		motion = true;
	}

	private void blinky() throws Exception
        {
                java.util.List<Pixel> up = getFadeUp( Pixel.RED, 50 );
                java.util.List<Pixel> down = getFadeDown( Pixel.RED, 50 );

                int offset = 0;
		log.info( "run" );
		Thread.sleep( 1 * 50 );

		offset = offset + 1;
		Frame frame = getOff();

		java.util.List<Frame> frames = new java.util.ArrayList<>();
		frames.add( frame );

		for( Pixel eye : up )
		{
			frame = getOff();
			frame.getPixels().set( 0, eye );
			frame.getPixels().set( 49, eye );
			frame.getPixels().set( 50, eye );
			frame.getPixels().set( 99, eye );
			frames.add( frame );
		}

		for( Pixel eye : down )
		{
			frame = getOff();
			frame.getPixels().set( 0, eye );
			frame.getPixels().set( 49, eye );
			frame.getPixels().set( 50, eye );
			frame.getPixels().set( 99, eye );
			frames.add( frame );
		}

		send( frames );                 
        }

	private void flap() throws Exception
        {
                java.util.List<Frame> frames = new java.util.ArrayList<>();
                for( int x = 0; x < 10 ; x++ )
                {
                        java.util.List<Frame> fadeUp = getFadeUpFrames( Pixel.BLUE, 25 );
                        turnOnEyes( fadeUp );
                        frames.addAll( fadeUp );

                        java.util.List<Frame> fadeDown = getFadeDownFrames( Pixel.BLUE, 25 );
                        turnOnEyes( fadeDown );
                        frames.addAll( fadeDown );
                }
                send( frames );
        }

	private void turnOnEyes( java.util.List<Frame> frames )
        {
                for( Frame frame : frames )
                {
                        Pixel eye = Pixel.RED;
                        frame.getPixels().set( 0, eye );
                        frame.getPixels().set( 49, eye );
                        frame.getPixels().set( 50, eye );
                        frame.getPixels().set( 99, eye );
                }
        }

	private void send( java.util.List<Frame> frames ) throws Exception
        {
                java.net.InetAddress address = java.net.InetAddress.getByName( "192.168.1.74" );
                java.net.DatagramSocket socket = new java.net.DatagramSocket();

                double framesPerSecond = 30.0;
                final double ns = 1000000000.0 / framesPerSecond;

                long lastTime = System.nanoTime();
                double delta = 0;

                while( frames.size() > 0 )
                {
                        long now = System.nanoTime();
                        delta += (now - lastTime) / ns;
                        lastTime = now;
                        if( delta >= 1 )
                        {
                                Frame frame = frames.remove( 0 );
                                delta--;

                                byte[] data = frame.getData();
                                java.net.DatagramPacket request = getRequest(address, data );
                                try
                                {
                                        socket.send(request);
                                }
                                catch( java.io.IOException ioe )
                                {
                                        ioe.printStackTrace();
                                }       
                        }
                }
        }

	private java.net.DatagramPacket getRequest( java.net.InetAddress address, byte[] data )
        {
                byte[] header = new byte[10];
                header[0] = 0x01; // flags1
                header[1] = 0x00; // flags2
                header[2] = 0x00; // type
                header[3] = 0x01; // id
                header[4] = 0x00; // offset1
                header[5] = 0x00; // offset2
                header[6] = 0x00; // offset3
                header[7] = 0x00; // offset4
                header[8] = (byte) (dataPoints & 0xFF); // len1
                header[9] = (byte) ((dataPoints >> 8) & 0xFF); // len2

                byte[] allByteArray = new byte[header.length + data.length];
                java.nio.ByteBuffer buff = java.nio.ByteBuffer.wrap(allByteArray);
                buff.put(header);
                buff.put(data);
                byte[] combined = buff.array();

                java.net.DatagramPacket request = new java.net.DatagramPacket(combined, combined.length, address, 4048);
                return request;
        }

	private java.util.List<Pixel> getFadeDown( Pixel color, int steps )
        {
                java.util.List<Pixel> pixels = new java.util.ArrayList<>();

                Float brightness = 1.0f;
                Float delta = 1.0f / steps ;
        
                for( int step = 0; step < steps; step++ )
                {
                        brightness = brightness - delta;
                        
                        Pixel pixel = new Pixel( color );
                        pixel.setBrightness( brightness );
                        pixels.add( pixel );
                       
                }

                return pixels;
        }

	private java.util.List<Frame> getFadeDownFrames( Pixel color, int steps )
        {               
                java.util.List<Frame> frames = new java.util.ArrayList<>();
                                
                Float brightness = 1.0f;
                Float delta = 1.0f / steps ;
                                
                for( int step = 0; step < steps; step++ )
                {               
                        Frame frame = new Frame();
                        brightness = brightness - delta;
                                
                        java.util.List<Pixel> pixels = new java.util.ArrayList<>();
                        for( int x = 0; x < numberOfPixels; x ++ )
                        {       
                                Pixel pixel = new Pixel( color );
                                pixel.setBrightness( brightness );
                                pixels.add( pixel );
                        }
                        frame.setPixels( pixels );
                        frames.add( frame );
                }
                
                return frames;
        }

	private java.util.List<Pixel> getFadeUp( Pixel color, int steps )
        {
                java.util.List<Pixel> pixels = new java.util.ArrayList<>();

                Float brightness = 0.0f;
                Float delta = 1.0f / steps ;

                for( int step = 0; step < steps; step++ )
                {
                        brightness = brightness + delta;

                        Pixel pixel = new Pixel( color );
                        pixel.setBrightness( brightness );
                        pixels.add( pixel );
                        
                }

                return pixels;
        }

	private java.util.List<Frame> getFadeUpFrames( Pixel color, int steps )
        {
                java.util.List<Frame> frames = new java.util.ArrayList<>();

                Float brightness = 0.0f;
                Float delta = 1.0f / steps ;

                for( int step = 0; step < steps; step++ )
                {
                        Frame frame = new Frame();
                        brightness = brightness + delta;

                        java.util.List<Pixel> pixels = new java.util.ArrayList<>();
                        for( int x = 0; x < numberOfPixels; x ++ )
                        {
                                Pixel pixel = new Pixel( color );
                                pixel.setBrightness( brightness );
                                pixels.add( pixel );
                        }
                        frame.setPixels( pixels );
                        frames.add( frame );                    
                }

                return frames;
        }

	private Frame getOff()
        {
                Frame frame = new Frame();
                
                java.util.List<Pixel> pixels = new java.util.ArrayList<>();
                for( int x = 0; x < numberOfPixels; x ++ )
                {
                        Pixel pixel = new Pixel();
                        pixel.off();
                        pixels.add( pixel );
                }

                frame.setPixels( pixels );

                return frame;   
        }
}
