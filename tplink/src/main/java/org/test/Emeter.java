package org.test;

import com.google.gson.annotations.SerializedName;

public class Emeter
{
	@SerializedName( "emeter" )
	private Realtime realtime;

	public Emeter()
	{
		realtime = new Realtime();
	}

	public Realtime getRealtime()
	{
		return realtime;
	}
} 
