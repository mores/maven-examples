package org.test;

public class Bulb
{
	private Transition transition_light_state;

	public Bulb( Pixel pixel )
	{
		transition_light_state = new Transition( pixel );
	}
}
