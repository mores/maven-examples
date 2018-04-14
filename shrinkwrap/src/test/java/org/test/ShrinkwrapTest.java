package org.test;

import org.jboss.shrinkwrap.api.Archive;
import org.jboss.arquillian.container.test.api.Deployment;

import org.junit.runner.RunWith;
import org.junit.Test;

@RunWith( org.jboss.arquillian.junit.Arquillian.class )
public class ShrinkwrapTest
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( ShrinkwrapTest.class );

	@Deployment
	public static Archive<?> createDeployment()
	{
		org.jboss.shrinkwrap.api.spec.JavaArchive jar = org.jboss.shrinkwrap.api.ShrinkWrap.create( org.jboss.shrinkwrap.api.spec.JavaArchive.class ).addAsResource( "one", "fred" );
		return jar;
	}

	@Test
	public void testZero() throws Exception
	{
		log.debug( "testZero" );
		String result = getFile( "one" );
		org.junit.Assert.assertEquals( "1", result );
	}

	@Test
	public void testOne() throws Exception
	{
		log.debug( "testOne" );
		String result = getFile( "fred" );
		org.junit.Assert.assertEquals( "1", result );
	}

	private String getFile( String path )
	{
		try
		{
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			java.io.InputStream inputStream = classLoader.getResourceAsStream( path );
			String data = org.apache.commons.io.IOUtils.toString( inputStream, "UTF-8" );
			return data.trim();
		}
		catch( Exception exception )
		{
		}

		return null;
	}
}
