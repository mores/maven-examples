package org.test;

import org.junit.Test;

public class AppTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( AppTest.class );

	@Test
	public void testAuth() throws Exception
	{
		String CLIENT_ID = "";
		String username = "";
		String password = "";

		String AUTHORITY = "https://login.microsoftonline.com/common/";
		String rootUrl = "https://outlook.office.com/api/v2.0/me";

		java.util.concurrent.ExecutorService service = java.util.concurrent.Executors.newFixedThreadPool(1);
		com.microsoft.aad.adal4j.AuthenticationContext context = new com.microsoft.aad.adal4j.AuthenticationContext(AUTHORITY, false, service);
		java.util.concurrent.Future<com.microsoft.aad.adal4j.AuthenticationResult> future = context.acquireToken( "https://outlook.office.com", CLIENT_ID, username, password, null);
		com.microsoft.aad.adal4j.AuthenticationResult result = future.get();

		log.debug( "Access Token - " + result.getAccessToken() );
            	log.debug( "Refresh Token - " + result.getRefreshToken() );
            	log.debug( "ID Token - " + result.getIdToken() );

		String entitySetName = "calendars";

		org.apache.olingo.client.api.ODataClient client = org.apache.olingo.client.core.ODataClientFactory.getClient();
		java.net.URI absoluteUri = client.newURIBuilder( rootUrl ).appendEntitySetSegment(entitySetName).build();
		log.info( "URL: " + absoluteUri );
		org.apache.olingo.client.api.communication.request.retrieve.ODataEntitySetIteratorRequest<org.apache.olingo.client.api.domain.ClientEntitySet, org.apache.olingo.client.api.domain.ClientEntity> request = client.getRetrieveRequestFactory().getEntitySetIteratorRequest(absoluteUri);
		request.addCustomHeader( "Authorization", "Bearer " + result.getAccessToken() );
		request.setAccept( "application/json;odata.metadata=minimal" );
		org.apache.olingo.client.api.communication.response.ODataRetrieveResponse<org.apache.olingo.client.api.domain.ClientEntitySetIterator<org.apache.olingo.client.api.domain.ClientEntitySet, org.apache.olingo.client.api.domain.ClientEntity>> Oresponse = request.execute();

		org.apache.olingo.client.api.domain.ClientEntitySetIterator<org.apache.olingo.client.api.domain.ClientEntitySet, org.apache.olingo.client.api.domain.ClientEntity> iterator = Oresponse.getBody();
                while( iterator.hasNext() )
                { 
                        org.apache.olingo.client.api.domain.ClientEntity ce = iterator.next(); 
                        java.util.List<org.apache.olingo.client.api.domain.ClientProperty> properties = ce.getProperties();
                        for( org.apache.olingo.client.api.domain.ClientProperty clientProperty : properties )
                        {
				log.debug( "Property: " + clientProperty.getName() + "\t" + clientProperty.getValue() );
                        }
                } 
	}
}
