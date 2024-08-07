package org.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase
{

	public AppTest(String testName)
	{
                super(testName);
        }

	public static Test suite()
	{
                TestSuite testsToRun = new TestSuite();
                testsToRun.addTest( new AppTest( "loadKeyStore" ) );

                return (testsToRun);
        }

	public void loadKeyStore() throws Exception
	{
		org.springframework.context.ApplicationContext context = new org.springframework.context.support.FileSystemXmlApplicationContext( "classpath:cert-beans.xml" );
		java.security.KeyStore keyStore = (java.security.KeyStore)context.getBean("keyStore");
		javax.net.ssl.KeyManager[] keyManager = (javax.net.ssl.KeyManager[])context.getBean("keyManager");
		org.springframework.ws.transport.http.HttpsUrlConnectionMessageSender sender = (org.springframework.ws.transport.http.HttpsUrlConnectionMessageSender)context.getBean("sender");
	}
}
