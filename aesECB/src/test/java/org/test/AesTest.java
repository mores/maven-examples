package org.test;

import org.junit.Test;

public class AesTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( AesTest.class );

	private javax.crypto.Cipher c;
	private byte[] encodedKey;

        @Test
        public void testOne() throws Exception
        {
		log.info( "testOne" );

		c = javax.crypto.Cipher.getInstance( "AES/ECB/PKCS5Padding" );

		encodedKey = hexStringToByteArray( "b685645b2fb26c4a83360efa35bd4727" );
		log.info( "Key: " + org.apache.commons.codec.binary.Hex.encodeHexString( encodedKey ) );

		String original = "This data in encrypted using Java AES ECB";
		byte[] text = original.getBytes();

		byte[] str = performEncryption( text );
		log.info( "Encrypted String : " + org.apache.commons.codec.binary.Hex.encodeHexString( str ) );

		String decryptedString = performDecryption( str );
		log.info( "Decrypted String : " + decryptedString );

		org.junit.Assert.assertEquals( original, decryptedString );

		org.bouncycastle.crypto.BlockCipher cipher = new org.bouncycastle.crypto.engines.AESEngine();
		org.bouncycastle.crypto.macs.CMac cmac = new org.bouncycastle.crypto.macs.CMac( cipher );
		cmac.init( new org.bouncycastle.crypto.params.KeyParameter( encodedKey ) );
		cmac.update( text, 0, text.length );
		byte[] out = new byte[cmac.getMacSize()];
		cmac.doFinal( out, 0 );
		//byte[] cipherMessageAuthCode = java.util.Arrays.copyOf(out, lengthBits / 8);

		log.info( "CMAC: " + org.apache.commons.codec.binary.Hex.encodeHexString( out ) );
	}

	public byte[] performEncryption( byte[] text ) throws Exception
	{
		javax.crypto.SecretKey myKey = new javax.crypto.spec.SecretKeySpec( encodedKey, 0, encodedKey.length, "AES" );

		c.init( javax.crypto.Cipher.ENCRYPT_MODE, myKey );
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

	public static byte[] hexStringToByteArray( String s )
	{
		int len = s.length();
		byte[] data = new byte[len / 2];
		for( int i = 0; i < len; i += 2 )
		{
			data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i+1), 16));
		}
		return data;
	}
}
