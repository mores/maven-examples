package org.test;

public class Payload
{
	private String gwId;
	private String devId;
	private String uid;

	private String t;

	public Payload( String devId )
	{
		this.devId = devId;
		this.gwId = devId;
		this.uid = devId;

		java.util.Date now = new java.util.Date();
		this.t = new Long(now.getTime()/1000).toString();
	}
}
