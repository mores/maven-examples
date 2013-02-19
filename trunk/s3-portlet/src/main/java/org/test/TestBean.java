package org.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class TestBean implements java.io.Serializable {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( TestBean.class );
    
	private String accessKey;
	private String secretKey;	

	private String bucket;

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

			accessKey = portletPreferences.getValue( "accessKey", "" );
			secretKey = portletPreferences.getValue( "secretKey", "" );
			bucket = portletPreferences.getValue( "bucket", "" );

			if( accessKey.length() > 0 && secretKey.length() > 0 && bucket .length() > 0 )
			{
				com.amazonaws.auth.BasicAWSCredentials creds = new com.amazonaws.auth.BasicAWSCredentials( accessKey, secretKey );
				com.amazonaws.services.s3.AmazonS3Client s3 = new com.amazonaws.services.s3.AmazonS3Client( creds );
				com.amazonaws.services.s3.model.ObjectListing listing = s3.listObjects( bucket );

				java.util.List<com.amazonaws.services.s3.model.S3ObjectSummary> files = listing.getObjectSummaries();
				// results always come back alphabetical order = i.e. the parent folder will show up first

				java.util.Hashtable<String,org.primefaces.model.TreeNode> treeLookup = new java.util.Hashtable();

				for( int x = 0; x < files.size(); x++ )
				{
					com.amazonaws.services.s3.model.S3ObjectSummary file = files.get( x );

					String[] parts = file.getKey().split( "/" );

					log.trace( x + " " + file.getKey() + " " + parts.length + " " + parts[ parts.length - 1 ] );

					if( parts.length == 1 )
					{
						org.primefaces.model.TreeNode tn = new org.primefaces.model.DefaultTreeNode( file, root );
						if( file.getKey().endsWith( "/" ) )
						{
							treeLookup.put( file.getKey(), tn );
						}		
					}
					else
					{
						String beginsWith = file.getKey().substring( 0, file.getKey().lastIndexOf( parts[ parts.length - 1 ] ) );
						log.trace( "beginsWith: " + beginsWith );

						org.primefaces.model.TreeNode found = treeLookup.get( beginsWith );
						if( found != null )
						{
							org.primefaces.model.TreeNode tn = new org.primefaces.model.DefaultTreeNode( file, found );
							if( file.getKey().endsWith( "/" ) )
							{
								treeLookup.put( file.getKey(), tn );
							}
						}
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

	public String getAccessKey()
	{
		return accessKey;
	}

	public void setAccessKey( String ac )
	{
		this.accessKey = ac;
	}

	public String getSecretKey()
	{
		return secretKey;
	}

	public void setSecretKey( String sk )
	{
		this.secretKey = sk;
	}

	public String getBucket()
	{
		return bucket;
	}

	public void setBucket( String b )
	{
		this.bucket = b;
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
			portletPreferences.setValue( "accessKey", accessKey );
			portletPreferences.setValue( "secretKey", secretKey );
			portletPreferences.setValue( "bucket", bucket );
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
