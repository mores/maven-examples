package org.test;

import org.junit.Test;

public class TuyaTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( TuyaTest.class );

	private String devId = "";
	private String key = "";

        @Test
        public void test() throws Exception
        {
                log.info( "test" );

		status();
        }

	private byte[] generate_payload( String command ) throws Exception
	{
		log.info( "generate_payload: " + command );

		com.google.gson.Gson gson = new com.google.gson.Gson();

		Payload payload = new Payload( devId );
		String json = gson.toJson( payload );
		log.info( "JSON: " + json );

		javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/ECB/PKCS5Padding");
		javax.crypto.spec.SecretKeySpec keySpec = new javax.crypto.spec.SecretKeySpec( key.getBytes("UTF-8"), "AES");
		cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, keySpec);

		byte[] encrypted = cipher.doFinal( json.getBytes("UTF-8") );
		log.info( "encrypted: " + org.apache.commons.codec.binary.Hex.encodeHexString( encrypted ) );

		java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
		output.write( encrypted );
		output.write( org.apache.commons.codec.binary.Hex.decodeHex( "000000000000aa55" ) );
		byte[] bff = output.toByteArray();

		log.info( "bff: " + org.apache.commons.codec.binary.Hex.encodeHexString( bff ) );

		output = new java.io.ByteArrayOutputStream();
		output.write( org.apache.commons.codec.binary.Hex.decodeHex( "000055aa00000000000000" ) );
		output.write( org.apache.commons.codec.binary.Hex.decodeHex( "0a" ) );
		output.write( org.apache.commons.codec.binary.Hex.decodeHex( "000000" ) );
		output.write( bff.length );
		output.write( bff );

		byte[] buf = output.toByteArray();
		Integer crc32b = crc32b( buf );
		log.info( "HEX crc: " + Integer.toHexString( crc32b ) );

		byte[] crc_bytes = java.nio.ByteBuffer.allocate(4).putInt( crc32b ).array();
		buf[ buf.length - 8 ] = crc_bytes[3];
		buf[ buf.length - 7 ] = crc_bytes[2];
		buf[ buf.length - 6 ] = crc_bytes[1];
		buf[ buf.length - 5 ] = crc_bytes[0];

		return buf;
	}

	private void send( byte[] message )
	{
		log.info( "send: " + org.apache.commons.codec.binary.Hex.encodeHexString( message ) );
	}

	private void status() throws Exception
	{
		log.info( "status" );
		send( generate_payload("status") );
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
}
