package com.test.dgs;

import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest;
import com.test.shopify.generated.client.*;

import org.junit.Test;

public class AppTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( AppTest.class );

	private com.netflix.graphql.dgs.client.CustomGraphQLClient client;

	@Test
	public void testOne() throws Exception
	{
		log.info( "testOne" );

		GraphQLQueryRequest graphQLQueryRequest = new GraphQLQueryRequest(
            new TicksGraphQLQuery.Builder()
                .first(5)
                .after(6)
                .build(),
            new TicksProjectionRoot<>()
                .edges()
                    .node()
                        .date()
                        .route()
                            .name()
                            .votes()
                                .starRating()
                                .parent()
                            .grade());

		String query = graphQLQueryRequest.serialize();
                log.info( "query: " + query );
	}
}
