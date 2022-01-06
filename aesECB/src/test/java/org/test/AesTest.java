package org.test;

import org.junit.Test;

public class AesTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( AesTest.class );

	private javax.crypto.Cipher c;
	private javax.crypto.SecretKey myKey;
	private byte[] encodedKey;

        @Test
        public void testOne() throws Exception
        {
		log.info( "testOne" );

		c = javax.crypto.Cipher.getInstance( "AES/ECB/PKCS5Padding" );
		myKey = javax.crypto.KeyGenerator.getInstance( "AES" ).generateKey();

		encodedKey = myKey.getEncoded();
		System.out.println( org.apache.commons.codec.binary.Hex.encodeHexString( encodedKey ) );

		String original = "This data in encrypted using Java AES ECB";

		byte[] str = performEncryption( original );
		System.out.println( "Encrypted String : " + org.apache.commons.codec.binary.Hex.encodeHexString( str ) );

		String decryptedString = performDecryption( str );
		System.out.println( "Decrypted String : " + decryptedString );

		org.junit.Assert.assertEquals( original, decryptedString );
	}

	public byte[] performEncryption(String s) throws Exception
	{
		c.init( javax.crypto.Cipher.ENCRYPT_MODE, myKey );
		byte[] text = s.getBytes();
		byte[] textEncrypted = c.doFinal( text );
		return( textEncrypted );
	}

	public String performDecryption( byte[] s ) throws Exception
	{
		javax.crypto.SecretKey originalKey = new javax.crypto.spec.SecretKeySpec( encodedKey, 0, encodedKey.length, "AES" );

		c.init( javax.crypto.Cipher.DECRYPT_MODE, originalKey );
		byte[] textDecrypted = c.doFinal( s );
		return( new String( textDecrypted ) );
	}
}
