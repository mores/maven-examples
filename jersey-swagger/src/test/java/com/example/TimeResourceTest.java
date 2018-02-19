package com.example;

import org.junit.Test;

public class TimeResourceTest extends org.glassfish.jersey.test.JerseyTest
{
	private static org.jboss.logging.Logger log = org.jboss.logging.Logger.getLogger( TimeResourceTest.class );

	public TimeResourceTest()
	{
		log.trace( "init" );
	}

	@Override
	protected javax.ws.rs.core.Application configure()
	{
		MyApplication application = new MyApplication();
		return application;
	}

	@Test
	public void testNow()
	{
		log.info( "test" );

		String testingWithKey = "777777";

		javax.ws.rs.client.ClientRequestFilter clientRequestFilter = new javax.ws.rs.client.ClientRequestFilter()
                {
                        public void filter( javax.ws.rs.client.ClientRequestContext clientRequestContext ) throws java.io.IOException
                        {
                                clientRequestContext.getHeaders().add( "api_key", testingWithKey );

                        }
                };

		org.glassfish.jersey.client.ClientConfig clientConfig = new org.glassfish.jersey.client.ClientConfig();
		clientConfig.register( com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider.class );
                clientConfig.register( clientRequestFilter );
		javax.ws.rs.client.Client client = javax.ws.rs.client.ClientBuilder.newBuilder().newClient( clientConfig );

		javax.ws.rs.core.Response response = client.target( "http://localhost:9998/time/now" ).request().get();
		log.trace( response );
		org.junit.Assert.assertTrue( response.getStatus() == 200 );

		SimpleBean simpleBean = response.readEntity(SimpleBean.class);
		log.trace( "username: " + simpleBean.getUserName() );
		org.junit.Assert.assertTrue( testingWithKey.equals( simpleBean.getUserName() ) );

	}
}
