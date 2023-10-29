package org.test;

import com.google.gson.annotations.SerializedName;

public class SmartBulb
{
	@SerializedName( "smartlife.iot.smartbulb.lightingservice" )
	private LightState lightingservice;

	public SmartBulb( Pixel pixel )
	{
		lightingservice = new LightState( pixel );
	}
} 
