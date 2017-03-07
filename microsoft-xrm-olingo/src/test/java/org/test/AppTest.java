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

		String serviceUrl = "https://" + company + ".crm.dynamics.com/api/data/v8.1/";
		String entitySetName = "accounts";

		org.apache.olingo.client.api.ODataClient client = org.apache.olingo.client.core.ODataClientFactory.getClient();	
		java.net.URI absoluteUri = client.newURIBuilder(serviceUrl).appendEntitySetSegment(entitySetName).build();
		org.apache.olingo.client.api.communication.request.retrieve.ODataEntitySetIteratorRequest<org.apache.olingo.client.api.domain.ClientEntitySet, org.apache.olingo.client.api.domain.ClientEntity> request = client.getRetrieveRequestFactory().getEntitySetIteratorRequest(absoluteUri);
		request.addCustomHeader( "Authorization", "Bearer " + result.getAccessToken() );
		request.setAccept("application/json;odata.metadata=minimal");
		org.apache.olingo.client.api.communication.response.ODataRetrieveResponse<org.apache.olingo.client.api.domain.ClientEntitySetIterator<org.apache.olingo.client.api.domain.ClientEntitySet, org.apache.olingo.client.api.domain.ClientEntity>> response = request.execute(); 
		
		org.apache.olingo.client.api.domain.ClientEntitySetIterator<org.apache.olingo.client.api.domain.ClientEntitySet, org.apache.olingo.client.api.domain.ClientEntity> iterator = response.getBody();
		while( iterator.hasNext() )
		{ 
			org.apache.olingo.client.api.domain.ClientEntity ce = iterator.next(); 
			java.util.List<org.apache.olingo.client.api.domain.ClientProperty> properties = ce.getProperties();
			for( org.apache.olingo.client.api.domain.ClientProperty clientProperty : properties )
			{
				if( "name".equals( clientProperty.getName() ) )
				{
					log.debug( "Property: " + clientProperty.getName() + "\t" + clientProperty.getValue() );
				}
			}
		} 
	}
}
