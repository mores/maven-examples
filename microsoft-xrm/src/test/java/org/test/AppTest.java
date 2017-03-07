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

		String url = "https://" + company + ".crm.dynamics.com/api/data/v8.1/accounts/";
	
		org.apache.http.client.methods.HttpPost httppost = new org.apache.http.client.methods.HttpPost( url );
		httppost.addHeader( "Content-Type", "application/json; charset=utf-8" );
		httppost.addHeader( "Accept", "application/json" );
                httppost.addHeader( "Authorization", "Bearer " + result.getAccessToken() );
                httppost.addHeader( "Host", company + ".crm.dynamics.com" );

		String newAccount = "{ 'name': 'Sample Account', 'creditonhold': false, 'address1_latitude': 47.639583, 'description': 'This is the description of the sample account', 'revenue': 5000000, 'accountcategorycode': 1 }";
		httppost.setEntity( new org.apache.http.entity.StringEntity( newAccount, "utf-8" ) );

		org.apache.http.HttpResponse response = httpClient.execute( httppost );
		org.apache.http.StatusLine sl = response.getStatusLine();
                log.info( "code: " + sl.getStatusCode() );
		org.apache.http.Header[] headers = response.getHeaders( "Location" );
		for( org.apache.http.Header header : headers)
		{
			log.info( "Added Account: " + header.getValue() );
		}

		org.apache.http.client.methods.HttpGet httpget = new org.apache.http.client.methods.HttpGet( url );
		httpget.addHeader( "Accept", "application/json" );
		httpget.addHeader( "Authorization", "Bearer " + result.getAccessToken() );
		httpget.addHeader( "Host", company + ".crm.dynamics.com" );
		httpget.addHeader( "OData-Version", "4.0" );
		httpget.addHeader( "Cache-Control", "no-cache" );
		org.apache.http.HttpResponse getResponse = httpClient.execute( httpget );
		org.apache.http.StatusLine getStatus = getResponse.getStatusLine();
		log.info( "code: " + getStatus.getStatusCode() );
		if( getStatus.getStatusCode() == 200 )
		{
			org.apache.http.HttpEntity entity = getResponse.getEntity();

			java.io.BufferedInputStream bis = new java.io.BufferedInputStream(entity.getContent());
			String filePath = "data.json";
			java.io.BufferedOutputStream bos = new java.io.BufferedOutputStream(new java.io.FileOutputStream(new java.io.File(filePath)));
			int inByte;
			while((inByte = bis.read()) != -1)
			{
				bos.write(inByte);
			}
			bis.close();
			bos.close();

			log.info( "File saved: " + filePath );
		}
	}
}
