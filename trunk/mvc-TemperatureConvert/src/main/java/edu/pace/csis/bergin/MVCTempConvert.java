package edu.pace.csis.bergin;

public class MVCTempConvert 
{	
	public static void main( String args[] ) 
	{	
		TemperatureModel temperature = new TemperatureModel();
		new FarenheitGUI( temperature, 125, 125 );
		new CelsiusGUI( temperature, 125, 250 );
		new SliderGUI(  temperature, 125, 375 );
		new GraphGUI( temperature, 325, 125 );
	}
}
