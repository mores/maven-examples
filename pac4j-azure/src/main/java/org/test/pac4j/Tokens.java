package org.test.pac4j;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean( name = "tokens" )
@ViewScoped
public class Tokens
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( Tokens.class );

	private org.pac4j.oidc.profile.azuread.AzureAdProfile azureAdProfile;

	public Tokens()
	{
		javax.faces.context.FacesContext facesContext = javax.faces.context.FacesContext.getCurrentInstance();
		javax.faces.context.ExternalContext ectx = facesContext.getExternalContext();
		javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)ectx.getRequest();
		javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)ectx.getResponse();

		org.pac4j.core.context.WebContext context = new org.pac4j.core.context.J2EContext( request, response );
		org.pac4j.core.profile.ProfileManager<org.pac4j.oidc.profile.azuread.AzureAdProfile> profileManager = new org.pac4j.core.profile.ProfileManager<org.pac4j.oidc.profile.azuread.AzureAdProfile>( context );

		java.util.List<org.pac4j.oidc.profile.azuread.AzureAdProfile> profiles = profileManager.getAll( true );
		azureAdProfile = profiles.get( 0 );
	}

	public String getIdToken()
	{
		com.nimbusds.jwt.JWT jwtFromOpenId = azureAdProfile.getIdToken();
		return jwtFromOpenId.serialize();
	}

	public String getAccessToken()
	{
		return azureAdProfile.getAccessToken().getValue();
	}

	public String getRefreshToken()
	{
		com.nimbusds.oauth2.sdk.token.RefreshToken refreshToken = azureAdProfile.getRefreshToken();
		return refreshToken.getValue();
	}
}
