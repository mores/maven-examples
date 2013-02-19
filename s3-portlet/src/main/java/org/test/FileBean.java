package org.test;

public class FileBean implements java.io.Serializable {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( FileBean.class );
    
	private String key;
	private String title;
	private String url;	

	public FileBean( com.amazonaws.services.s3.model.S3ObjectSummary file, javax.portlet.ResourceURL rurl )
	{
		log.trace( "init" );
		this.key = file.getKey();
		String[] parts = file.getKey().split( "/" );
		this.title = parts[ parts.length - 1 ];

		if( rurl != null )
		{
			url = rurl.toString();
		}
	}

	public String getKey()
	{
		return key;
	}

	public void setKey( String k )
	{
		this.key = k;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle( String t )
	{
		this.title = t;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl( String u )
	{
		this.url = u;
	}
}
