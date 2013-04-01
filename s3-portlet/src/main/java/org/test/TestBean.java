package org.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class TestBean implements java.io.Serializable {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( TestBean.class );
    
	// S3 specific
	private String accessKey;
	private String bucket;
	private String secretKey;	
	
	// UI
	private boolean defaultOrdering;			
	private int fileCount;
	private String filterOut;
	private boolean scrollable;
	private int scrollHeight;

	private org.primefaces.model.TreeNode root;
	private java.util.List<com.amazonaws.services.s3.model.S3ObjectSummary> files;
	private java.util.Map<String,javax.portlet.ResourceURL> resources;

	public TestBean()
	{
		log.trace( "init" );
		resources = new java.util.Hashtable();
		try
		{
			javax.faces.context.FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
			javax.faces.context.ExternalContext ectx = context.getExternalContext();
			javax.portlet.RenderResponse renderResponse = (javax.portlet.RenderResponse)ectx.getResponse();

			javax.portlet.PortletRequest portletRequest = (javax.portlet.PortletRequest)ectx.getRequest();
			javax.portlet.PortletPreferences portletPreferences = portletRequest.getPreferences();

			accessKey = portletPreferences.getValue( "accessKey", "" );
			secretKey = portletPreferences.getValue( "secretKey", "" );
			bucket = portletPreferences.getValue( "bucket", "" );

			defaultOrdering = new Boolean( portletPreferences.getValue( "defaultOrdering", "true" ) ).booleanValue();
			scrollable = new Boolean( portletPreferences.getValue( "scrollable", "false" ) ).booleanValue();
			scrollHeight = new Integer( portletPreferences.getValue( "scrollHeight", "400" ) ).intValue();

			if( accessKey.length() > 0 && secretKey.length() > 0 && bucket .length() > 0 )
			{
				com.amazonaws.auth.BasicAWSCredentials creds = new com.amazonaws.auth.BasicAWSCredentials( accessKey, secretKey );
				com.amazonaws.services.s3.AmazonS3Client s3 = new com.amazonaws.services.s3.AmazonS3Client( creds );
				com.amazonaws.services.s3.model.ObjectListing listing = s3.listObjects( bucket );

				files = listing.getObjectSummaries();
				// results always come back alphabetical order = i.e. the parent folder will show up first

				if( ! defaultOrdering )
				{
					java.util.Collections.reverse( files );
				}

				// index urls
				for( int x = 0; x < files.size(); x++ )
				{
					com.amazonaws.services.s3.model.S3ObjectSummary file = files.get( x );
					if( ! file.getKey().endsWith( "/" ) )
					{
						javax.portlet.ResourceURL rurl = renderResponse.createResourceURL();
						rurl.setResourceID( file.getKey() );
						resources.put( file.getKey(), rurl );
					}
				}
				display();
			}
			else
			{
				files = new java.util.Vector();
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

	private void display()
	{
		log.trace( "display: " + filterOut );
		fileCount = 0;
		root = new org.primefaces.model.DefaultTreeNode( "root", null );
		java.util.Hashtable<String,org.primefaces.model.TreeNode> treeLookup = new java.util.Hashtable();

		for( int x = 0; x < files.size(); x++ )
		{
			com.amazonaws.services.s3.model.S3ObjectSummary file = files.get( x );

			int index = 999;
			if( ( filterOut != null ) && ( ! filterOut.equals( "" ) ) )
			{
				index = file.getKey().toLowerCase().indexOf( filterOut.toLowerCase() );
			}

			if( index > -1 )
			{
				String[] parts = file.getKey().split( "/" );
				String title = parts[ parts.length - 1 ];
				log.trace( x + " " + file.getKey() + " " + parts.length + " " + title );

				for( int y = 1; y < parts.length + 1; y++ )
				{
					String path = buildPath( parts, y );
					String[] folderParts = path.split( "/" );
					String folder = folderParts[ folderParts.length - 1 ];
					log.trace( "Path: " + path + "\t" + folder );

					org.primefaces.model.TreeNode found = treeLookup.get( path );
					if( found == null )
					{
						FileBean fb = new FileBean();
						fb.setTitle( folder );
						if( y == parts.length )
						{
							// Set the download url
							javax.portlet.ResourceURL rurl = resources.get( file.getKey() );
							if( rurl != null )
							{
								fb.setTitle( title );
								fb.setUrl( rurl.toString() );
								fileCount = fileCount + 1;
							}
						}
						org.primefaces.model.TreeNode tn = null;
						if( y == 1 )
						{
							
							tn = new org.primefaces.model.DefaultTreeNode( fb, root );
						}
						else
						{
							String parentPath = buildPath( parts, y - 1 );
							log.trace( "Parent Path: " + parentPath );
							tn = new org.primefaces.model.DefaultTreeNode( fb, treeLookup.get( parentPath ) );
						}
						treeLookup.put( path, tn );
					}

				
				}
			}
		}
	}

	private String buildPath( String[] parts, int upto )
	{
		String path = new String();
		for( int x = 0; x < upto; x++ )
		{
			path = path + parts[x] + "/";
		}
		return path;	
	}

	public String getAccessKey()
	{
		return accessKey;
	}

	public void setAccessKey( String ac )
	{
		this.accessKey = ac;
	}

	public boolean getDefaultOrdering()
	{
		return defaultOrdering;
	}

	public void setDefaultOrdering( boolean d )
	{
		this.defaultOrdering = d;
	}

	public String getFileCount()
	{
		return fileCount + " file(s) found";
	}

	public String getFilterOut()
	{
		return filterOut;
	}

	public void setFilterOut( String fo )
	{
		this.filterOut = fo;
		display();
	}

	public String getSecretKey()
	{
		return secretKey;
	}

	public void setSecretKey( String sk )
	{
		this.secretKey = sk;
	}

	public boolean getScrollable()
	{
		return scrollable;
	}

	public void setScrollable( boolean s )
	{
		this.scrollable = s;
	}

	public int getScrollHeight()
	{
		return scrollHeight;
	}

	public void setScrollHeight( int sh )
	{
		this.scrollHeight = sh;
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

			portletPreferences.setValue( "defaultOrdering", new Boolean( defaultOrdering ).toString() );
			portletPreferences.setValue( "scrollable", new Boolean( scrollable ).toString() );
			portletPreferences.setValue( "scrollHeight", new Integer( scrollHeight ).toString() );
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
