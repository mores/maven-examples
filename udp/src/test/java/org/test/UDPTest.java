package org.test;

import org.junit.Test;

public class UDPTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( UDPTest.class );

	private static Float brightness = 0.0f;
	private static boolean up = true;
	private static int x = 0;

	private static java.net.InetAddress address;
	private static java.net.DatagramSocket socket;


	private int numberOfPixels = 51;
	private int numberOfChannels = 3;
	private int dataPoints = numberOfPixels * numberOfChannels;

	@Test
	public void loop() throws Exception
	{

		address = java.net.InetAddress.getByName( "192.168.1.74" );
		socket = new java.net.DatagramSocket();

		java.util.TimerTask task = new java.util.TimerTask()
		{
			public void run()
			{
				//log.debug( x + "\t" + brightness );
				x = x + 1;

				if( up )
				{
					brightness = brightness + 0.01f;
				}
				else
				{
					brightness = brightness - 0.01f;
				}

				if( brightness.compareTo( 0.0f ) < 0 )
				{
					up = true;
				}
				else if( brightness.compareTo( 1.0f ) > 0 )
				{
					up = false;
				}

				byte[] data = getData( brightness );
				java.net.DatagramPacket request = getRequest( data );
				try
				{
					socket.send(request);
				}
				catch( java.io.IOException ioe )
				{
					ioe.printStackTrace();
				}
			}
		};
		java.util.Timer timer = new java.util.Timer("Timer");
    
		long delay = 50L;
		timer.schedule(task, 0L, delay);

		
		java.util.Scanner scanner = new java.util.Scanner( System.in );
		scanner.nextLine();
	}

	private java.net.DatagramPacket getRequest( byte[] data )
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

	private byte[] getData( float brightness )
	{
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

		byte[] data = new byte[0];
		for( Pixel pixel : pixels )
		{
			data = org.apache.commons.lang3.ArrayUtils.addAll( data, pixel.getRGB() );
		}

		return data;
	}
}
