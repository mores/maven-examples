package org.test;

public class Energy
{
	private Integer power_mw;

	public Integer getPowerMilliwatt()
	{
		return power_mw;
	}

	public Integer getPowerWatt()
	{
		if( power_mw == null )
		{
			return null;
		}

		return power_mw / 1000;
	}
} 
