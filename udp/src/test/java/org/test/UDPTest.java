package org.test;

import org.junit.Test;

public class UDPTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( UDPTest.class );

	private int numberOfPixels = 51;
	private int numberOfChannels = 3;
	private int dataPoints = numberOfPixels * numberOfChannels;

	@Test
	public void nano() throws Exception
	{
		java.util.List<Frame> frames = getUpDownFrames();
		log.info( "Number of Frames: " + frames.size() );

		java.net.InetAddress address = java.net.InetAddress.getByName( "192.168.1.74" );
                java.net.DatagramSocket socket = new java.net.DatagramSocket();

		double framesPerSecond = 60.0;
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

	private java.util.List<Frame> getUpDownFrames()
	{
		java.util.List<Frame> frames = new java.util.ArrayList<>();

		Float brightness = 0.0f;
		boolean done = false;
		boolean up = true;

		while ( ! done )
		{
			if( up )
			{
				brightness = brightness + 0.005f;
			}
			else
			{
				brightness = brightness - 0.005f;
			}

			if( brightness.compareTo( 0.0f ) < 0 )
			{
				done = true;
			}
			else if( brightness.compareTo( 1.0f ) > 0 )
			{
				up = false;
			}

			Frame frame = getRainbow( brightness );
			frames.add( frame );
		}

		return frames;
	}

	private Frame getRainbow( float brightness )
	{
		Frame frame = new Frame();

		java.util.List<Pixel> pixels = new java.util.ArrayList<>();
		for( int x = 0; x < numberOfPixels; x ++ )
		{
			Pixel pixel = new Pixel();
			pixel.setBrightness( brightness );
			pixels.add( pixel );	

			int remainder = x % 14;
			switch( remainder )
			{
				case 0:
					pixel.on();
					break;

				case 1:
					pixel.off();
					break;

				case 2:
					pixel.red();
					break;

				case 3:
					pixel.orange();
					break;

				case 4:
					pixel.yellow();
					break;

				case 5: 
					pixel.chartreuse();
					break;

				case 6:
					pixel.green();
					break;

				case 7:
					pixel.springGreen();
					break;

				case 8:
					pixel.cyan();
					break;

				case 9:
					pixel.azure();
					break;

				case 10:
					pixel.blue();
					break;

				case 11:
					pixel.violet();
					break;

				case 12:
					pixel.magenta();
					break;

				case 13:
					pixel.pink();
					break;
			}

		}

		frame.setPixels( pixels );

		return frame;
	}

	private java.util.List<java.awt.Color> getGradient( java.awt.Color begin, java.awt.Color end, int steps )
	{
		java.util.List<java.awt.Color> colors = new java.util.ArrayList<>();

		for (int i = 0; i < steps; i++)
		{
			float ratio = (float) i / (float) steps;

			int red = (int) (end.getRed() * ratio + begin.getRed() * (1 - ratio));
			int green = (int) (end.getGreen() * ratio + begin.getGreen() * (1 - ratio));
			int blue = (int) (end.getBlue() * ratio + begin.getBlue() * (1 - ratio));

			java.awt.Color stepColor = new java.awt.Color(red, green, blue);
			colors.add( stepColor );
		}

		return colors;
	}
}
