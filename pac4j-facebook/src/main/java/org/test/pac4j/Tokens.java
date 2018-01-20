package org.test.pac4j;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean( name = "tokens" )
@ViewScoped
public class Tokens
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( Tokens.class );

	private org.pac4j.oauth.profile.facebook.FacebookProfile facebookProfile;
	private String text;

	public Tokens()
	{
		javax.faces.context.FacesContext facesContext = javax.faces.context.FacesContext.getCurrentInstance();
		javax.faces.context.ExternalContext ectx = facesContext.getExternalContext();
		javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)ectx.getRequest();
		javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)ectx.getResponse();

		org.pac4j.core.context.WebContext context = new org.pac4j.core.context.J2EContext( request, response );
		org.pac4j.core.profile.ProfileManager<org.pac4j.oauth.profile.facebook.FacebookProfile> profileManager = new org.pac4j.core.profile.ProfileManager<org.pac4j.oauth.profile.facebook.FacebookProfile>( context );

		java.util.List<org.pac4j.oauth.profile.facebook.FacebookProfile> profiles = profileManager.getAll( true );
		facebookProfile = profiles.get( 0 );
	}

	/*
	public String getIdToken()
	{
		com.nimbusds.jwt.JWT jwtFromOpenId = azureAdProfile.getIdToken();

		try
		{
			com.nimbusds.jwt.JWTClaimsSet claims = jwtFromOpenId.getJWTClaimsSet();
			java.util.Date expiresOn = claims.getExpirationTime();
			log.info( "Expires on: " + expiresOn );

			for( String claim : claims.getClaims().keySet() )
			{
				log.info( claim + "\t" + claims.getClaims().get( claim ) );
			}
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}

		return jwtFromOpenId.serialize();
	}
	*/

	public String getAccessToken()
	{
		return facebookProfile.getAccessToken();
	}

	/*
	public java.util.Date getAuthTime()
	{
		return azureAdProfile.getAuthTime();
	}

	public String getRefreshToken()
	{
		com.nimbusds.oauth2.sdk.token.RefreshToken refreshToken = azureAdProfile.getRefreshToken();
		return refreshToken.getValue();
	}

	public String getAccessTokenFromRefreshToken()
	{
		org.pac4j.core.config.Config config = org.pac4j.core.config.ConfigSingleton.getConfig();
		org.pac4j.core.client.Clients clients = config.getClients();
		org.pac4j.oidc.client.AzureAdClient azureAdClient = clients.findClient( org.pac4j.oidc.client.AzureAdClient.class );
		String accessToken = azureAdClient.getAccessTokenFromRefreshToken( azureAdProfile );

		log.info( "obj: " + azureAdClient );
		return azureAdClient.getAccessTokenFromRefreshToken( azureAdProfile );
	}

	public String getText()
	{
		return text;
	}

        public void setText(String text)
	{
        	this.text = text;
	}
	*/
}
