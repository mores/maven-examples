package org.test;

public class LightState 
{
	private Transition transition_light_state;

	public LightState( Pixel pixel )
	{
		transition_light_state = new Transition( pixel );
	}
}
