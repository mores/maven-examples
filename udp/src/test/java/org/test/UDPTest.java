package org.test;

import org.junit.Test;

public class UDPTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( UDPTest.class );

	@Test
	public void testDPP() throws Exception
	{
		log.info( "testDPP" );

		java.net.DatagramSocket socket = new java.net.DatagramSocket();
                java.net.InetAddress address = java.net.InetAddress.getByName( "192.168.1.74" );

		int numberOfPixels = 51;
		int numberOfChannels = 3;
		int dataPoints = numberOfPixels * numberOfChannels;

		byte[] data = new byte[dataPoints];
		for( int x = 0; x < dataPoints; x++ )
		{
			data[x] = 0x00;

			if( x % 3 == 0 && x > 0 )
			{
				data[x - 1] = 0x23;
			}
		}
		data[dataPoints - 1] = 0x23;

		// pixel 1
		data[0] = 0x25; //red > 25 <= 7F
		data[1] = 0x25;	//green > 25 <= 7F
		data[2] = 0x25; //blue > 25 <= 7F

		// pixel 2
		data[3] = 0x15;
		data[4] = 0x00;
		data[5] = 0x00;

		// pixel 3
		data[6] = 0x00;
                data[7] = 0x20;
                data[8] = 0x00;

		data[9] = 0x00;
                data[10] = 0x00;
                data[11] = 0x23;

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
                socket.send(request);
	}
}
