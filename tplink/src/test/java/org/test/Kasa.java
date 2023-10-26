package org.test;

import com.google.gson.annotations.SerializedName;

public class Kasa
{
	@SerializedName( "smartlife.iot.smartbulb.lightingservice" )
	private Bulb lightingservice;

	public Kasa( Pixel pixel )
	{
		lightingservice = new Bulb( pixel );
	}
} 
