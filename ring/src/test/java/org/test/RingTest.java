package org.test;

import org.junit.Test;

public class RingTest
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( RingTest.class );

	private String hardwareId = "mac101";

	//@Test
	public void test() throws Exception
	{
		log.info( "test" );

		// step 1
		//getAuth( "" );

		// step 2
		//getAuth( "575865" );
	}

	private void getAuth( String mfaCode ) throws Exception
	{
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

		java.net.http.HttpRequest request = java.net.http.HttpRequest.newBuilder()
			.POST( java.net.http.HttpRequest.BodyPublishers.ofString( json ) )
			.uri( java.net.URI.create( "https://oauth.ring.com/oauth/token" ) )
			.header( "2fa-support", "true" )
			.header( "2fa-code", mfaCode )
			.header( "hardware_id", hardwareId )
			.header( "User-Agent", "android:com.ringapp" )
			.build();

		java.net.http.HttpResponse<String> response = httpClient.send( request, java.net.http.HttpResponse.BodyHandlers.ofString() );
		log.info( "Status Code: " + response.statusCode() );
		if( 200 == response.statusCode() )
		{
			com.google.gson.JsonElement jsonElement = com.google.gson.JsonParser.parseString( response.body() );
                        com.google.gson.JsonObject jsonObject = jsonElement.getAsJsonObject();
                        String refresh_token = jsonObject.get( "refresh_token" ).toString();
                        log.info( "refresh_token: " + refresh_token );
		}
		else if( 412 == response.statusCode() )
		{
			// good - now we can provide 2nd factor
			log.info( response.body() );
		}
		else
		{
			log.info( response.body() );
		}
	}

	@Test
	public void testThree() throws Exception
	{
		//System.setProperty( "jdk.httpclient.HttpClient.log", "all" );

		String refreshToken = "";

		java.net.http.HttpClient httpClient = java.net.http.HttpClient.newBuilder()
                        .version( java.net.http.HttpClient.Version.HTTP_2 )
                        .connectTimeout( java.time.Duration.ofSeconds( 10 ) )
                        .build();

		com.google.gson.Gson gson = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
                java.util.Map<String, String> map = new java.util.HashMap<>();
                map.put( "client_id", "ring_official_android" );
                map.put( "scope", "client" );
                map.put( "grant_type", "refresh_token" );
		map.put( "refresh_token", refreshToken );

		String json = gson.toJson( map );

		java.net.http.HttpRequest request = java.net.http.HttpRequest.newBuilder()
                        .POST( java.net.http.HttpRequest.BodyPublishers.ofString( json ) )
                        .uri( java.net.URI.create( "https://oauth.ring.com/oauth/token" ) )
                        .header( "hardware_id", hardwareId )
                        .header( "User-Agent", "android:com.ringapp" )
                        .build();

                java.net.http.HttpResponse<String> response = httpClient.send( request, java.net.http.HttpResponse.BodyHandlers.ofString() );
                log.info( "Status Code: " + response.statusCode() );
		if( 200 == response.statusCode() )
		{
			com.google.gson.JsonElement jsonElement = com.google.gson.JsonParser.parseString( response.body() );
			com.google.gson.JsonObject jsonObject = jsonElement.getAsJsonObject();
			String access_token = jsonObject.get( "access_token" ).toString().replaceAll( "\"", "" );
			log.info( "access_token: " + access_token );

			java.net.http.HttpRequest devicesRequest = java.net.http.HttpRequest.newBuilder()
				.GET()
				.uri( java.net.URI.create( "https://api.ring.com/devices/v1/locations" ) )
 				.header( "Content-Type", "application/json" )
				.header( "hardware_id", hardwareId )
				.header( "User-Agent", "android:com.ringapp:3.25.0(26452333)" )
				.header( "app_brand", "ring" )
				.header( "Accept-Encoding", "gzip, deflate" )
				.header( "Authorization", "Bearer " + access_token )
				.build();

			java.net.http.HttpResponse<String> devicesResponse = httpClient.send( devicesRequest, java.net.http.HttpResponse.BodyHandlers.ofString() );
			log.info( "Status Code: " + devicesResponse.statusCode() );
			log.info( devicesResponse.body() );
		}
		else
		{
			log.warn( response.body() );
		}
	}
}
