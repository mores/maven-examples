package org.test.pac4j;

public class ConfigFactory implements org.pac4j.core.config.ConfigFactory
{
	private String localCallbackUrl = "";
	private String key = "";
	private String secret = "";

	@Override
	public org.pac4j.core.config.Config build( final Object... parameters )
	{
		org.pac4j.oauth.client.FacebookClient facebookClient = new org.pac4j.oauth.client.FacebookClient( key, secret );

		final org.pac4j.core.client.Clients clients = new org.pac4j.core.client.Clients( localCallbackUrl, facebookClient );
		clients.setDefaultClient( facebookClient );

		final org.pac4j.core.config.Config config = new org.pac4j.core.config.Config( clients );

		org.pac4j.core.matching.PathMatcher pathMatcher = new org.pac4j.core.matching.PathMatcher();
		config.addMatcher( "excludedPath", pathMatcher );
	
		return config;	
	}
}
