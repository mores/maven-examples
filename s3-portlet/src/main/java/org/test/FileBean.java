package org.test;

public class FileBean implements java.io.Serializable {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( FileBean.class );
    
	private String title;
	private String url;	

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
