package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	"date",
	"username"
})
@XmlRootElement(name = "Simple")
public class SimpleBean
{
	private java.util.Date date;
	private String username;

	public SimpleBean()
	{
		date = new java.util.Date();
	}

	public java.util.Date getDate()
	{
		return date;
	}

	public void setDate( java.util.Date date )
	{
		this.date = date;
	}

	public String getUserName()
	{
		return username;
	}

	public void setUserName( String username )
	{
		this.username = username;
	}	
}
