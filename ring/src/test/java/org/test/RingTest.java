package org.test;

import org.junit.Test;

public class RingTest
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( RingTest.class );

	@Test
	public void test() throws Exception
	{
		log.info( "test" );

		String hardwareId = "mac101";
		String username = "xyz";
		String password = "123";

		java.net.http.HttpClient httpClient = java.net.http.HttpClient.newBuilder()
			.version( java.net.http.HttpClient.Version.HTTP_2 )
			.connectTimeout( java.time.Duration.ofSeconds( 10 ) )
			.build();

		com.google.gson.Gson gson = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
		java.util.Map<String, String> map = new java.util.HashMap<>();
		map.put( "client_id", "ring_official_android" );
		map.put( "scope", "client" );
		map.put( "grant_type", "password" );
		map.put( "username", username );
		map.put( "password", password );
		String json = gson.toJson( map );
		log.info( json );

		java.net.http.HttpRequest request = java.net.http.HttpRequest.newBuilder()
			.POST( java.net.http.HttpRequest.BodyPublishers.ofString( json ) )
			.uri( java.net.URI.create( "https://oauth.ring.com/oauth/token" ) )
			.header( "2fa-support", "true" )
			.header( "2fa-code", "" )
			.header( "hardware_id", hardwareId )
			.header( "User-Agent", "android:com.ringapp" )
			.build();

		java.net.http.HttpResponse<String> response = httpClient.send( request, java.net.http.HttpResponse.BodyHandlers.ofString() );
		log.info( "Status Code: " + response.statusCode() );
		log.info( response.body() );
	}
}
