package org.test;

public class ADUser implements java.io.Serializable
{
	private String distinguishedName = "";
	private String givenName = "";
	private String surName = "";
	private String sAMAccountName = "";
	private String displayName = "";
	private String mail = "";
	private String department = "";
	private String manager = "";
	private String office = "";
	private String title = "";
	private String phone = "";

	public String getDN()
	{
		return( distinguishedName );
	}

	public void setDN( String dn )
	{
		this.distinguishedName = dn;
	}


	public String getFirstname()
	{
		return( givenName );
	}

	public void setFirstname( String name )
	{
		this.givenName = name;
	}


	public String getLastname()
	{
		return( surName );
	}

	public void setLastname( String name )
	{
		this.surName = name;
	}


	public String getAccountname()
	{
		return( sAMAccountName );
	}

	public void setAccountname( String acct )
	{
		this.sAMAccountName = acct;
	}


	public String getDisplayname()
	{
		return( displayName );
	}

	public void setDisplayname( String name )
	{
		this.displayName = name;
	}


	public String getMail()
	{
		return( mail );
	}

	public void setMail( String mail )
	{
		this.mail = mail;
	}

	public String getDepartment()
	{
		return( department );
	}

	public void setDepartment( String dept )
	{
		this.department = dept ;
	}


	public String getManager()
	{
		return( manager );
	}

	public void setManager( String mgr )
	{
		this.manager = mgr;
	}


	public String getOffice()
	{
		return( office );
	}

	public void setOffice( String off )
	{
		this.office = off;
	}


	public String getTitle()
	{
		return( title );
	}

	public void setTitle( String title )
	{
		this.title = title;
	}

	public String getPhone()
	{
		return( phone );
	}

	public void setPhone( String ph )
	{
		this.phone = ph;
	}
}
