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

	private org.primefaces.model.TreeNode root;

	public TestBean()
	{
		log.trace( "init" );
		root = new org.primefaces.model.DefaultTreeNode( "root", null ); 
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

				java.util.List<com.google.api.services.drive.model.File> files = new java.util.ArrayList<com.google.api.services.drive.model.File>();
				com.google.api.services.drive.Drive.Files.List request = service.files().list(); 

				com.google.api.services.drive.model.FileList fileList = request.execute();
				files.addAll( fileList.getItems() );
				log.trace( "Size of files: " + files.size() );

				// All files not yet a tree node
				java.util.Hashtable<String,com.google.api.services.drive.model.File> lookup = new java.util.Hashtable();
				java.util.Hashtable<String,org.primefaces.model.TreeNode> treeLookup = new java.util.Hashtable();

				for( int x = 0; x < files.size(); x++ )
				{
					com.google.api.services.drive.model.File file = files.get( x );
					log.trace( x + " " + file.getId() + " " + file.getTitle() + " " + file.getShared() );
					// Don't reshare anything that was shared to me.
					if( ! file.getShared() )
					{
						lookup.put( file.getId(), file );

						java.util.List<com.google.api.services.drive.model.ParentReference> parents = file.getParents();
						for( int y = 0; y < parents.size(); y++ )
						{
							com.google.api.services.drive.model.ParentReference pr = parents.get( y );
							if( pr.getIsRoot() )
							{
								org.primefaces.model.TreeNode tn = new org.primefaces.model.DefaultTreeNode( file, root );
								treeLookup.put( file.getId(), tn );
								lookup.remove( file.getId() );

								log.trace( x + "\t" + file.getId() );
							}
						}
					}
				}
				log.trace( lookup.size() + " " + treeLookup.size() );

				while( lookup.size() > 0 )
				{
					makeTheTree( lookup, treeLookup );
					log.trace( lookup.size() + " " + treeLookup.size() );
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

	private void makeTheTree( java.util.Hashtable<String,com.google.api.services.drive.model.File> lookup, java.util.Hashtable<String,org.primefaces.model.TreeNode> treeLookup )
	{
		// Lets place the rest in the tree
		java.util.Enumeration e = lookup.keys();
		while( e.hasMoreElements() )
		{
			String id = (String)e.nextElement();
			com.google.api.services.drive.model.File file = lookup.get( id );
			java.util.List<com.google.api.services.drive.model.ParentReference> parents = file.getParents();
			for( int y = 0; y < parents.size(); y++ )
			{
				com.google.api.services.drive.model.ParentReference pr = parents.get( y );
				if( treeLookup.get( pr.getId() ) != null )
				{
					org.primefaces.model.TreeNode parent = treeLookup.get( pr.getId() );
					org.primefaces.model.TreeNode tn = new org.primefaces.model.DefaultTreeNode( file, parent );
					treeLookup.put( file.getId(), tn );
					lookup.remove( file.getId() );
				}
			}
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

	public org.primefaces.model.TreeNode getRoot()
	{
		return root;
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
