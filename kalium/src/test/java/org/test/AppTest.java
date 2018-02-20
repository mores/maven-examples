package org.test;

import org.junit.Test;

public class AppTest
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( AppTest.class );

	@Test
	public void testEncrypt() throws Exception
	{
		log.info( "testEncrypt" );

		java.security.SecureRandom r = new java.security.SecureRandom();
        	org.abstractj.kalium.keys.KeyPair keyPair = new org.abstractj.kalium.keys.KeyPair(new byte[org.abstractj.kalium.NaCl.Sodium.CRYPTO_BOX_CURVE25519XSALSA20POLY1305_SECRETKEYBYTES]);
		byte[] privateKey = keyPair.getPrivateKey().toBytes();
		byte[] publicKey = keyPair.getPublicKey().toBytes();

		byte[] payload = new byte[r.nextInt(1000)];
		r.nextBytes( payload );

		org.abstractj.kalium.crypto.SealedBox sb = new org.abstractj.kalium.crypto.SealedBox( publicKey );
		byte[] c = sb.encrypt( payload );

		org.abstractj.kalium.crypto.SealedBox sb2 = new org.abstractj.kalium.crypto.SealedBox( publicKey, privateKey );
		byte[] decryptedPayload = sb2.decrypt( c );
		org.junit.Assert.assertArrayEquals( payload, decryptedPayload );
	}
}
