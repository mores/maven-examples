package org.test;

public class RealTimeAdjustment implements DataPoint
{
	@Override
	public java.util.Map<String,String> getCommand()
	{
		java.util.Map<String, String> dps = new java.util.HashMap<>();
		//dps.put( "28", "103e803e803e800120025" );
		dps.put( "28", "1007603e803e800120025" );

		return dps;
	}	
}
