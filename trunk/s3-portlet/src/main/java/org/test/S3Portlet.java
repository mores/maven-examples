package org.test;

public class S3Portlet extends org.portletfaces.bridge.GenericFacesPortlet
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( S3Portlet.class );

	public S3Portlet()
	{
		super();
	}

	public void init( javax.portlet.PortletConfig portletConfig ) throws javax.portlet.PortletException
        {
                super.init( portletConfig );
        }

	@Override
	public void serveResource( javax.portlet.ResourceRequest request, javax.portlet.ResourceResponse response ) throws javax.portlet.PortletException, java.io.IOException 
	{
		if( request.getResourceID() == null )
		{
			super.serveResource( request, response );
		}
		else
		{
			javax.faces.context.FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
                        javax.faces.context.ExternalContext ectx = context.getExternalContext();

                        javax.portlet.PortletRequest portletRequest = (javax.portlet.PortletRequest)ectx.getRequest();
                        javax.portlet.PortletPreferences portletPreferences = portletRequest.getPreferences();

                        String accessKey = portletPreferences.getValue( "accessKey", "" );
                        String  secretKey = portletPreferences.getValue( "secretKey", "" );
                        String bucket = portletPreferences.getValue( "bucket", "" );

                        if( accessKey.length() > 0 && secretKey.length() > 0 && bucket .length() > 0 )
                        {
                                com.amazonaws.auth.BasicAWSCredentials creds = new com.amazonaws.auth.BasicAWSCredentials( accessKey, secretKey );
                                com.amazonaws.services.s3.AmazonS3Client s3 = new com.amazonaws.services.s3.AmazonS3Client( creds );
				com.amazonaws.services.s3.model.S3Object obj = s3.getObject( bucket, request.getResourceID() );
				if( obj != null )
				{
					log.trace( "Have object - will travel" );
					com.amazonaws.services.s3.model.ObjectMetadata meta = obj.getObjectMetadata();	
					response.setContentType( meta.getContentType() );
					java.io.InputStream is = obj.getObjectContent();
					java.io.OutputStream out = response.getPortletOutputStream();

					byte[] buffer = new byte[4096];
					int bytesRead;
					while( (bytesRead = is.read(buffer)) != -1)
					{
						out.write( buffer, 0, bytesRead );
					}
					is.close();
					out.flush();
					out.close();
				}
			}
		}	
	}	
}
