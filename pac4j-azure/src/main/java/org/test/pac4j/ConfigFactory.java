package org.test.pac4j;

public class ConfigFactory implements org.pac4j.core.config.ConfigFactory
{
	private String localCallbackUrl = "";
	private String microsoftApplicationId = "";
	private String microsoftApplicationSecret = "";
	private String microsoftTenant = "";

	@Override
	public org.pac4j.core.config.Config build( final Object... parameters )
	{
		final org.pac4j.oidc.config.OidcConfiguration azureOidcConfiguration = new org.pac4j.oidc.config.OidcConfiguration();

		azureOidcConfiguration.setClientId( microsoftApplicationId );
                azureOidcConfiguration.setDiscoveryURI( "https://login.microsoftonline.com/" + microsoftTenant + "/.well-known/openid-configuration" );
                azureOidcConfiguration.setSecret( microsoftApplicationSecret );

                final org.pac4j.oidc.client.AzureAdClient azureAdClient = new org.pac4j.oidc.client.AzureAdClient( azureOidcConfiguration );
		azureAdClient.setCallbackUrlResolver(new org.pac4j.core.http.callback.PathParameterCallbackUrlResolver());

                final org.pac4j.core.client.Clients clients = new org.pac4j.core.client.Clients( localCallbackUrl, azureAdClient );

                final org.pac4j.core.config.Config config = new org.pac4j.core.config.Config( clients );

		org.pac4j.core.matching.PathMatcher pathMatcher = new org.pac4j.core.matching.PathMatcher();
		config.addMatcher( "excludedPath", pathMatcher );

                return config;
	}
}
