package org.test;

import org.junit.Test;

public class TplinkTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( TplinkTest.class );

	private String ip = "192.168.1.216";

        @Test
        public void test() throws Exception
        {
                log.info( "test" );

		String json = "{\"system\":{\"get_sysinfo\":null}}";
		log.info( "Json: " + json );
		byte[] encrypted = encrypt( json );
		log.debug( "encrypted: " + org.apache.commons.codec.binary.Hex.encodeHexString( encrypted ) );

		java.net.Socket socket = new java.net.Socket(ip, 9999);
		java.io.DataInputStream input = new java.io.DataInputStream( socket.getInputStream() );
		java.io.OutputStream socketOutput = socket.getOutputStream();

		socketOutput.write( encrypted );

		byte[] header = new byte[4];
		input.read( header );

		log.debug( "header: " + org.apache.commons.codec.binary.Hex.encodeHexString( header ) );

		byte[] bytes = new byte[2048];
		input.read( bytes );

		log.debug( "recieved: " + org.apache.commons.codec.binary.Hex.encodeHexString( bytes ) );

		String message = decrypt( bytes );
		log.info( "Message: " + message );
	}

	public static byte[] encrypt( String string )
	{
		int key = 171;
		java.nio.ByteBuffer buffer = java.nio.ByteBuffer.allocate(4);
		buffer.order( java.nio.ByteOrder.BIG_ENDIAN );
		buffer.putInt( string.length() );
		byte[] result = buffer.array();
		for( int i = 0; i < string.length(); i++ )
		{
		    int a = key ^ (int) string.charAt(i);
		    key = a;
		    byte[] bytes = new byte[1];
		    bytes[0] = (byte) a;
		    result = concatenateByteArrays(result, bytes);
		}
		return result;
	}

	public static byte[] concatenateByteArrays(byte[] a, byte[] b)
	{
		byte[] result = new byte[a.length + b.length];
		System.arraycopy(a, 0, result, 0, a.length);
		System.arraycopy(b, 0, result, a.length, b.length);
		return result;
    	}

	public static String decrypt( byte[] data )
        {
                int key = 171;
                String result = "";
		for( int i = 0; i < data.length; i++ )
		{
			int unsignedInt = Byte.toUnsignedInt( data[i] );
			if( unsignedInt == 0 )
			{
				return result;
			}

                        int a = key ^ unsignedInt;
                        key = unsignedInt;
                        result += (char) a;
                }
                return result;
        }
}
