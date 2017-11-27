package org.test;

public class Item
{
	/* cosmo fields */
	private String _attachments;
	private String _etag;
	private String _rid;
	private String _self;
	private String _ts;
	private String entityType;
	private String id;
	
	/* user defined fields */
	private String name;

	public String getId()
	{
		return id;
	}

	public void setId( String id )
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	@Override
        public String toString()
        {
                return String.format( "%s[id=%s]%s", getClass().getSimpleName(), getId(), getName() );
        }
}
