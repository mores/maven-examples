package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	"date",
	"message"
})
@XmlRootElement(name = "Error")
public class ErrorBean
{
	private java.util.Date date;
	private String message;

	public ErrorBean()
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

	public String getMessage()
	{
		return message;
	}

	public void setMessage( String message )
	{
		this.message = message;
	}	
}
