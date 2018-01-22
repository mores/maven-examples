package com.example;

public class SimpleBean
{
	private String username;

	public String getUserName()
	{
		return username;
	}

	public void setUserName( String username )
	{
		this.username = username;
	}	

	public String toJson()
	{
		return String.format( "{\"value\" : \"" + username + ", The time is %s\"}", new org.joda.time.DateTime() );
	}
}
