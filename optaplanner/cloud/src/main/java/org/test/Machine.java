package org.test;

public class Machine
{
	private double cost;
	private double startupTime;
	private String configuration;
	private int id;

	public Machine( double cost, double startupTime, String configuration, int id )
	{
		this.cost = cost;
		this.startupTime = startupTime;
		this.configuration = configuration;
		this.id = id;
	}

	public double getCost()
	{
		return cost;
	}

	public double getStartupTime()
	{
		return startupTime;
	}

	public String getConfiguration()
	{
		return configuration;
	}
}
