package org.test;

import org.junit.Test;

public class TuyaTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( TuyaTest.class );

	private String devId = "";
	private String key = "";

	private String ip = "";

	@Test
	public void testTwo() throws Exception
        {
                log.info( "testTwo" );
		RealTimeAdjustment rta = new RealTimeAdjustment();
		send( generate_payload( rta ) );
	}

        @Test
        public void test() throws Exception
        {
                log.info( "test" );
		status();
        }

	private String decrypt( byte[] payload ) throws Exception
	{
		log.info( "length: " + payload.length );
		log.info( "decrypting: " + org.apache.commons.codec.binary.Hex.encodeHexString( payload ) );

		javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/ECB/PKCS5Padding");
                javax.crypto.spec.SecretKeySpec keySpec = new javax.crypto.spec.SecretKeySpec( key.getBytes("UTF-8"), "AES");
                cipher.init(javax.crypto.Cipher.DECRYPT_MODE, keySpec );

		byte[] decrypted = cipher.doFinal( payload );
		String plaintext = new String( decrypted, java.nio.charset.StandardCharsets.UTF_8 );
		log.debug( "decrypted: " + plaintext );

		return plaintext;
	}

	private byte[] encrypt( String plaintext ) throws Exception
	{
		javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/ECB/PKCS5Padding");
                javax.crypto.spec.SecretKeySpec keySpec = new javax.crypto.spec.SecretKeySpec( key.getBytes("UTF-8"), "AES");
                cipher.init( javax.crypto.Cipher.ENCRYPT_MODE, keySpec );

                byte[] encrypted = cipher.doFinal( plaintext.getBytes("UTF-8") );
                log.debug( "encrypted: " + org.apache.commons.codec.binary.Hex.encodeHexString( encrypted ) );

		return encrypted;
	}

	private byte[] generate_payload( DataPoint dps ) throws Exception
	{
		log.info( "generate_payload: " + dps );

		com.google.gson.Gson gson = new com.google.gson.Gson();

		Payload payload = new Payload( devId );
		if( dps != null )
		{
			payload.setDps( dps.getCommand() );
		}
		String json = gson.toJson( payload );
		log.info( "JSON: " + json );

		byte[] encrypted = encrypt( json );

		java.io.ByteArrayOutputStream constructed = new java.io.ByteArrayOutputStream();
		if( dps != null )
		{
			constructed.write( "3.3\0\0\0\0\0\0\0\0\0\0\0\0".getBytes() );
			constructed.write( encrypted );
		}
		else
		{
			constructed.write( encrypted );
		}

		java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
		output.write( constructed.toByteArray() );
		output.write( org.apache.commons.codec.binary.Hex.decodeHex( "000000000000aa55" ) );
		byte[] bff = output.toByteArray();

		log.info( "bff: " + org.apache.commons.codec.binary.Hex.encodeHexString( bff ) );
		log.info( "bff length: " + bff.length );

		int payload_len = bff.length + 8 + 4;
		log.info( "payload_len: " + payload_len );

		output = new java.io.ByteArrayOutputStream();

		// prefix_nr
		output.write( org.apache.commons.codec.binary.Hex.decodeHex( "000055aa0000" ) );

		int msgSequence = 43;
		output.write( msgSequence >> 8 );
	        output.write( msgSequence );
		output.write( org.apache.commons.codec.binary.Hex.decodeHex( "000000" ) );
		// hexByte
		if( dps != null )
		{
			output.write( org.apache.commons.codec.binary.Hex.decodeHex( "07" ) );
		}
		else
		{
			output.write( org.apache.commons.codec.binary.Hex.decodeHex( "0a" ) );
		}
		output.write( org.apache.commons.codec.binary.Hex.decodeHex( "000000" ) );
		output.write( bff.length );
		output.write( bff );

		byte[] buf = output.toByteArray();
		Integer crc32b = crc32b( buf );
		log.info( "HEX crc: " + Integer.toHexString( crc32b ) );
		log.info( "HEX crc: " + Integer.toHexString( REV( crc32b ) ) );

		byte[] crc_bytes = java.nio.ByteBuffer.allocate(4).putInt( crc32b ).array();
		buf[ buf.length - 8 ] = crc_bytes[3];
		buf[ buf.length - 7 ] = crc_bytes[2];
		buf[ buf.length - 6 ] = crc_bytes[1];
		buf[ buf.length - 5 ] = crc_bytes[0];

		return buf;
	}

	private void send( byte[] message ) throws Exception
	{
		log.info( "send: " + org.apache.commons.codec.binary.Hex.encodeHexString( message ) );

		java.net.Socket socket = new java.net.Socket(ip, 6668);
		java.io.DataInputStream input = new java.io.DataInputStream( socket.getInputStream() );
		java.io.OutputStream socketOutput = socket.getOutputStream();

		socketOutput.write( message );

		byte[] bytes = new byte[127];
		input.read( bytes );

		log.info( "recieved: " + org.apache.commons.codec.binary.Hex.encodeHexString( bytes ) );

		int message_type = bytes[11];
		log.info( "Message Type: " + message_type );

		int messageStart = 0;
		int messageEnd = 0;

		if( 7 == message_type )
		{
			return;
		}

		// DP_QUERY
		if( 10 == message_type )
		{
			messageStart = 20;
			for( int x = messageStart; x < bytes.length -1; x++ )
			{
				if( bytes[x] == (byte)0xAA && bytes[x+1] == (byte)0x55)
				{
					messageEnd = x - messageStart - 6;
				}
			}
		}

		log.info( "Message End: " + messageEnd );

		java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
		for( int x  = messageStart; x < messageEnd + messageStart; x++ )
		{
			output.write( bytes[x] );
		}

		byte[] payload = output.toByteArray();
		log.info( "payload: " + org.apache.commons.codec.binary.Hex.encodeHexString( payload ) );

		String jsonStatus = decrypt( payload );

		com.google.gson.JsonObject jsonObject = new com.google.gson.JsonParser().parse( jsonStatus ).getAsJsonObject();
		com.google.gson.JsonObject dps = jsonObject.get( "dps" ).getAsJsonObject();

		log.info( "DPS: " + dps );
	}

	private void status() throws Exception
	{
		log.info( "status" );
		send( generate_payload(null) );
	}

	private Integer crc32b( byte[] bytes )
	{
		int length = bytes.length - 8;

		java.util.zip.Checksum checksum = new java.util.zip.CRC32();
		checksum.update( bytes, 0, length ); 
		int crc32 = new Long( checksum.getValue() ).intValue();
		log.info( "CRC32: " + crc32 );

		java.nio.ByteBuffer buf = java.nio.ByteBuffer.allocate(4);
		buf.putInt( crc32 ); // BIG_ENDIAN by default.
		buf.order( java.nio.ByteOrder.LITTLE_ENDIAN );
		Integer crc32b = buf.getInt(0);
		log.info( "CRC32b: " + crc32b );

		return crc32b;
	}

	private int REV(int n)
	{
		return ((n >> 24) & 0xff)
		    | // (n >> 24) - 0x000000aa
		    ((n << 8) & 0xff0000)
		    | // (n << 24) - 0xdd000000
		    ((n >> 8) & 0xff00)
		    | // (((n >> 16) << 24) >> 16) - 0xbb00
		    ((n << 24) & 0xff000000);
	}
}
