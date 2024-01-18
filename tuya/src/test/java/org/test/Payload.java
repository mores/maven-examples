package org.test;

public class Payload
{
	private String devId;
	private String uid;

	private String t;

	private java.util.Map<String, String> dps;

	public Payload( String devId )
	{
		this.devId = devId;
		this.uid = devId;

		java.util.Date now = new java.util.Date();
		this.t = new Long(now.getTime()/1000).toString();
	}

	public void setDps( java.util.Map<String, String> dps )
	{
		this.dps = dps;
	}
}
