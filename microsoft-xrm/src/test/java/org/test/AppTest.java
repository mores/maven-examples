package org.test;

import org.junit.Test;

public class AppTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( AppTest.class );

	@Test
	public void testAuth() throws Exception
	{
		String company  = "";
		String username = "@" + company + ".onmicrosoft.com";
		String password = "";

		String AUTHORITY = "https://login.microsoftonline.com/common/";
		String CLIENT_ID = "";

		java.util.concurrent.ExecutorService service = java.util.concurrent.Executors.newFixedThreadPool(1);
		com.microsoft.aad.adal4j.AuthenticationContext context = new com.microsoft.aad.adal4j.AuthenticationContext(AUTHORITY, false, service);
		java.util.concurrent.Future<com.microsoft.aad.adal4j.AuthenticationResult> future = context.acquireToken( "https://" + company + ".crm.dynamics.com", CLIENT_ID, username, password, null);
		com.microsoft.aad.adal4j.AuthenticationResult result = future.get();

		log.debug("Access Token - " + result.getAccessToken());
            	log.debug("Refresh Token - " + result.getRefreshToken());
            	log.debug("ID Token - " + result.getIdToken());

		org.apache.http.impl.client.HttpClientBuilder clientBuilder = org.apache.http.impl.client.HttpClientBuilder.create();
		org.apache.http.impl.client.CloseableHttpClient httpClient = clientBuilder.build();

		org.apache.http.client.methods.HttpGet httpget = new org.apache.http.client.methods.HttpGet( "https://" + company + ".crm.dynamics.com/api/data/v8.1/accounts/" );
		httpget.addHeader( "Accept", "application/json" );
		httpget.addHeader( "Authorization", "Bearer " + result.getAccessToken() );
		httpget.addHeader( "Host", company + ".crm.dynamics.com" );
		httpget.addHeader( "OData-Version", "4.0" );
		httpget.addHeader( "Cache-Control", "no-cache" );
		org.apache.http.HttpResponse response = httpClient.execute( httpget );
		org.apache.http.StatusLine sl = response.getStatusLine();
		log.info( "code: " + sl.getStatusCode() );
		if( sl.getStatusCode() == 200 )
		{
			org.apache.http.HttpEntity entity = response.getEntity();
			StringBuilder sb = new StringBuilder();
			java.io.BufferedReader br = new java.io.BufferedReader( new java.io.InputStreamReader( entity.getContent() ) );
			String line = null;

                        while( ( line = br.readLine() ) != null )
                        {
                                sb.append( line );
                        }

                        br.close();

                        org.apache.http.util.EntityUtils.consume( entity );

			log.debug( sb.toString() );
		}
	}
}
