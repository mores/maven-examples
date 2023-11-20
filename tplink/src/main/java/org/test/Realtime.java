package org.test;

import com.google.gson.annotations.SerializedName;

public class Realtime
{
	@SerializedName( "get_realtime" )
	private Energy energy;

	public Realtime()
	{
		energy = new Energy();
	}

	public Energy getEnergy()
	{
		return energy;
	}
} 
