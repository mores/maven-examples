package org.test;

public class ADUtils
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( ADUtils.class );

	private java.util.Hashtable adConfig;
	private String searchBase;

	private String objAttribs[] = {"distinguishedName","givenName","sn","sAMAccountName","displayName","mail","department","manager","telephoneNumber","title","memberOf"};

	public ADUtils( java.util.Hashtable config, String searchBase )
	{
		this.adConfig = config;
		this.searchBase = searchBase;	
	}

	private javax.naming.directory.DirContext getCTX() throws javax.naming.NamingException
	{
		javax.naming.directory.DirContext ctx = new javax.naming.directory.InitialDirContext( adConfig );

		return ctx;
	}

	public java.util.Map<String,ADUser> getADUsers()
	{
		log.debug( "Starting to load" );

		java.util.Map users = new java.util.Hashtable();

		try
		{
			javax.naming.directory.DirContext ctx = getCTX();

			String searchFilter = "(&(objectCategory=person)(objectClass=user))";
			javax.naming.directory.SearchControls srchInfo = new javax.naming.directory.SearchControls();
			srchInfo.setSearchScope( javax.naming.directory.SearchControls.SUBTREE_SCOPE );
			srchInfo.setReturningAttributes( objAttribs );

			javax.naming.NamingEnumeration dirObjects = ctx.search(searchBase, searchFilter, srchInfo);
			while( dirObjects.hasMore() )
			{
				javax.naming.directory.SearchResult dirObject = (javax.naming.directory.SearchResult)dirObjects.next();

				ADUser user = new ADUser();
				user.setDN( getItem( dirObject, 0 ) );
				user.setFirstname( getItem( dirObject, 1 ) );
				user.setLastname( getItem( dirObject, 2 ) );
				user.setAccountname( getItem( dirObject, 3 ) );
				user.setDisplayname( getItem( dirObject, 4 ) );
				user.setMail( getItem( dirObject, 5 ) );
				user.setDepartment( getItem( dirObject, 6 ) );
				user.setManager( getItem( dirObject, 7 ) );
				user.setPhone( getItem( dirObject, 8 ) );
				user.setTitle( getItem( dirObject, 9 ) );                    
            
				users.put( getItem( dirObject, 0 ), user );
			}
		}
		catch( Exception e )
		{
			java.io.StringWriter sw = new java.io.StringWriter();
			java.io.PrintWriter pw = new java.io.PrintWriter( sw );
			e.printStackTrace( pw );
			log.error( "Failed: " + sw.toString() );
		}

		return users;
	}

	public ADUser getUserByNtId( String ntid )
	{
		log.debug( "Looking for ntid: " + ntid );
		String searchFilter = "(&(objectCategory=person)(objectClass=user)(sAMAccountName=" + ntid + "))";
		return getSpecificUser( searchFilter, ntid );
	}

	private ADUser getSpecificUser( String searchFilter, String user )
	{
		try
		{
			javax.naming.directory.DirContext ctx = getCTX();

			javax.naming.directory.SearchControls srchInfo = new javax.naming.directory.SearchControls();
			srchInfo.setSearchScope( javax.naming.directory.SearchControls.SUBTREE_SCOPE );
			srchInfo.setReturningAttributes( objAttribs );

			javax.naming.NamingEnumeration dirObjects = ctx.search(searchBase, searchFilter, srchInfo);
			if( dirObjects.hasMore() )
			{
				javax.naming.directory.SearchResult dirObject = (javax.naming.directory.SearchResult)dirObjects.next();

				ADUser person = new ADUser();
				person.setDN( getItem( dirObject, 0 ) );
				person.setFirstname( getItem( dirObject, 1 ) );
				person.setLastname( getItem( dirObject, 2 ) );
				person.setAccountname( getItem( dirObject, 3 ) );
				person.setDisplayname( getItem( dirObject, 4 ) );
				person.setMail( getItem( dirObject, 5 ) );
				person.setDepartment( getItem( dirObject, 6 ) );
				person.setManager( getItem( dirObject, 7 ) );
				person.setPhone( getItem( dirObject, 8 ) );
				person.setTitle( getItem( dirObject, 9 ) );

				int totalResults = 0;

				javax.naming.directory.Attributes attrs = dirObject.getAttributes();
				if( attrs != null )
				{
					attrs.remove( "givenName" );
					attrs.remove( "sn" );
					attrs.remove( "manager" );
					attrs.remove( "displayName" );
					attrs.remove( "department" );
					attrs.remove( "mail" );
					attrs.remove( "distinguishedName" );
					attrs.remove( "sAMAccountName" );
					attrs.remove( "telephoneNumber" );
					attrs.remove( "title" );

					try
					{
						for( javax.naming.NamingEnumeration ae = attrs.getAll(); ae.hasMore();)
						{
							javax.naming.directory.Attribute attr = (javax.naming.directory.Attribute)ae.next();
							log.debug( "Attribute: " + attr.getID() );
							for (javax.naming.NamingEnumeration e2 = attr.getAll();e2.hasMore();totalResults++)
							{
								log.debug(" " +  totalResults + ". " +  e2.next());
							}
						}
					}
					catch( javax.naming.NamingException e3 ) 
					{
						log.error( "Problem listing membership: " + e3 );
					}
				}

				return person;
			}
		}
		catch( Exception e )
		{
			java.io.StringWriter sw = new java.io.StringWriter();
			java.io.PrintWriter pw = new java.io.PrintWriter( sw );
			e.printStackTrace( pw );
			log.error( "Failed: " + sw.toString() );
		}

		return null;
	}

	public boolean isMemberOf( String ntid, String groupName )
	{
		boolean result = false;
    
		try
		{
			javax.naming.directory.DirContext ctx = getCTX();

			javax.naming.directory.SearchControls srchInfo = new javax.naming.directory.SearchControls();
			srchInfo.setSearchScope( javax.naming.directory.SearchControls.SUBTREE_SCOPE );
			srchInfo.setReturningAttributes( objAttribs );

			String searchFilter = "(&(objectCategory=person)(objectClass=user)(sAMAccountName=" + ntid + ")(memberOf=" + groupName + "))";
			javax.naming.NamingEnumeration dirObjects = ctx.search( searchBase, searchFilter, srchInfo );

			if( dirObjects.hasMoreElements() )
			{
				return( true );
			}
		}
		catch( Exception e )
		{
			java.io.StringWriter sw = new java.io.StringWriter();
			java.io.PrintWriter pw = new java.io.PrintWriter( sw );
			e.printStackTrace( pw );
			log.error( "Failed: " + sw.toString() );
		}

		return result;
	}	

	private String getItem( javax.naming.directory.SearchResult dirObject, int index )
	{
		String result = "";

		javax.naming.directory.Attributes attrs = dirObject.getAttributes();
		if( attrs != null )
		{
			javax.naming.directory.Attribute attr = attrs.get( objAttribs[ index ] );
			if( attr != null )
			{
				try
				{
					result = (String)attr.get();
				}
				catch( javax.naming.NamingException e )
				{
					java.io.StringWriter sw = new java.io.StringWriter();
					java.io.PrintWriter pw = new java.io.PrintWriter( sw );
					e.printStackTrace( pw );
					log.error( "Failed: " + sw.toString() ); 
				}
			 }
		}
		return result;
	}
}
