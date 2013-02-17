package org.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class TestBean implements java.io.Serializable {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( TestBean.class );
    
	private String clientId;
	private String clientSecret;	

	private String accessToken;
	private String refreshToken;

	private String redirectUrl = "urn:ietf:wg:oauth:2.0:oob";

	private java.util.List<com.google.api.services.drive.model.File> files;

	public TestBean()
	{
		log.trace( "init" );
		try
		{
			javax.faces.context.FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
			javax.faces.context.ExternalContext ectx = context.getExternalContext();

			javax.portlet.PortletRequest portletRequest = (javax.portlet.PortletRequest)ectx.getRequest();
			javax.portlet.PortletPreferences portletPreferences = portletRequest.getPreferences();

			clientId = portletPreferences.getValue( "clientId", "" );
			clientSecret = portletPreferences.getValue( "clientSecret", "" );
			accessToken = portletPreferences.getValue( "accessToken", "" );
			refreshToken = portletPreferences.getValue( "refreshToken", "" );

			if( clientId.length() > 0 && clientSecret.length() > 0 && accessToken.length() > 0 && refreshToken.length() > 0 )
			{

				com.google.api.client.http.HttpTransport httpTransport = new com.google.api.client.http.javanet.NetHttpTransport();
				com.google.api.client.json.jackson2.JacksonFactory jsonFactory = new com.google.api.client.json.jackson2.JacksonFactory();

				com.google.api.client.auth.oauth2.TokenResponse tokenResponse = new com.google.api.client.auth.oauth2.TokenResponse();
				tokenResponse.setAccessToken( accessToken );
				tokenResponse.setRefreshToken( refreshToken );

				com.google.api.client.googleapis.auth.oauth2.GoogleCredential credentials = new com.google.api.client.googleapis.auth.oauth2.GoogleCredential.Builder().setTransport( httpTransport ).setJsonFactory( jsonFactory ).setClientSecrets( clientId, clientSecret ).build().setFromTokenResponse( tokenResponse );

				com.google.api.services.drive.Drive service = new com.google.api.services.drive.Drive.Builder( httpTransport, jsonFactory, credentials ).build();

				files = new java.util.ArrayList<com.google.api.services.drive.model.File>();
				com.google.api.services.drive.Drive.Files.List request = service.files().list(); 

				com.google.api.services.drive.model.FileList fileList = request.execute();
				files.addAll( fileList.getItems() );
				log.trace( "Size of files: " + files.size() );

				for( int x = 0; x < files.size(); x++ )
				{
					com.google.api.services.drive.model.File file = files.get( x );
					log.trace( "Title: " + file.getTitle() );
					com.google.api.services.drive.model.File.Labels labels = file.getLabels();
					java.util.Iterator it = labels.entrySet().iterator();
					while( it.hasNext() )
					{
						java.util.Map.Entry pairs = (java.util.Map.Entry)it.next();
						log.trace(pairs.getKey() + " = " + pairs.getValue());	
					}
				}
			}
		}
		catch( Exception e )
		{
			java.io.StringWriter sw = new java.io.StringWriter();
                        java.io.PrintWriter pw = new java.io.PrintWriter( sw );
                        e.printStackTrace( pw );
                        log.error( "Error: " + sw.toString() );
		}
	}
    
	public String getClientId()
	{
		return clientId;
	}

	public void setClientId( String c )
	{
		this.clientId = c;
	}

	public String getClientSecret()
	{
		return clientSecret;
	}

	public void setClientSecret( String c )
	{
		this.clientSecret = c;
	}

	public String getAccessToken()
	{
		return accessToken;
	}

	public void setAccessToken( String at )
	{
		this.accessToken = at;
	}

	public String getRefreshToken()
	{
		return refreshToken;
	}

	public void setRefreshToken( String rt )
	{
		this.refreshToken = rt;
	}

	public java.util.List<com.google.api.services.drive.model.File> getFiles()
	{
		return files;
	}

	public void setFiles( java.util.List<com.google.api.services.drive.model.File> f )
	{
		this.files = f;
	}

	public void savePrefs()
	{
		javax.faces.context.FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
                javax.faces.context.ExternalContext ectx = context.getExternalContext();

                javax.portlet.PortletRequest portletRequest = (javax.portlet.PortletRequest)ectx.getRequest();
                javax.portlet.PortletPreferences portletPreferences = portletRequest.getPreferences();

                javax.faces.application.FacesMessage returnMsg = new javax.faces.application.FacesMessage();
		try
		{
			portletPreferences.setValue( "clientId", clientId );
			portletPreferences.setValue( "clientSecret", clientSecret );
			portletPreferences.setValue( "accessToken", accessToken );
			portletPreferences.setValue( "refreshToken", refreshToken );
                        portletPreferences.store();

                        returnMsg.setSeverity( javax.faces.application.FacesMessage.SEVERITY_INFO );
                        returnMsg.setSummary( "Saved" );
                }
                catch( Exception e )
                {
                        java.io.StringWriter sw = new java.io.StringWriter();
                        java.io.PrintWriter pw = new java.io.PrintWriter( sw );
                        e.printStackTrace( pw );

                        returnMsg.setSeverity( javax.faces.application.FacesMessage.SEVERITY_ERROR );
                        returnMsg.setSummary( "System Error" );
                }

                javax.faces.context.FacesContext.getCurrentInstance().addMessage( null, returnMsg );
	}
}
