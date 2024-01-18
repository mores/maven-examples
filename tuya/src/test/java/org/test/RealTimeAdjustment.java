package org.test;

public class RealTimeAdjustment implements DataPoint
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( TuyaTest.class );

	// RGB bulb
	private int hue; // 0 - 360
	private int saturation; // 0 - 1000
	private int value; // 0 - 1000

	// White bulb
	private int brightness; // 0 - 1000
	private int temperature; // 0 - 1000

	public RealTimeAdjustment( int brightness, int temperature )
	{
		this.brightness = brightness;
		this.temperature = temperature;
	}

	public RealTimeAdjustment( int red, int green, int blue )
	{
		float[] hsb = java.awt.Color.RGBtoHSB( red, green, blue, null );
		this.hue = (int)(hsb[0] * 360);
		this.saturation = (int)(hsb[1] * 1000);
		this.value = (int)(hsb[2] * 1000);

		log.info( "Hue: " + hue );
		log.info( "Saturation: " + saturation );
		log.info( "Value: " + value );
	}

	@Override
	public java.util.Map<String,String> getCommand()
	{
		java.util.Map<String, String> dps = new java.util.HashMap<>();

		// gradiant
		dps.put( "28", "1" + String.format("%04x", hue ) + String.format("%04x", saturation ) + String.format("%04x", value ) + String.format("%04x", brightness ) + String.format("%04x", temperature ) );

		return dps;
	}	
}
