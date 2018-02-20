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
		byte[] sk = keyPair.getPrivateKey().toBytes();
		byte[] pk = keyPair.getPublicKey().toBytes();
		byte[] m = new byte[r.nextInt(1000)];

		r.nextBytes(m);
		org.abstractj.kalium.crypto.SealedBox sb = new org.abstractj.kalium.crypto.SealedBox(pk);
		byte[] c = sb.encrypt(m);

		org.abstractj.kalium.crypto.SealedBox sb2 = new org.abstractj.kalium.crypto.SealedBox(pk, sk);
		byte[] m2 = sb2.decrypt(c);
		org.junit.Assert.assertArrayEquals(m, m2);
	}
}
