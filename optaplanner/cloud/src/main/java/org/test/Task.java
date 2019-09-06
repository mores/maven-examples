package org.test;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

@PlanningEntity
public class Task
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( Task.class );

	private String taskType;
	private int id;
	private java.util.Map<String,Double> machineTimings;
	private Machine machine;

	public Task()
	{
	}

	public Task( String taskType, int id )
	{
		this.taskType = taskType;
		this.id = id;
		machineTimings = new java.util.HashMap<>();
	}

	public String getTaskType()
	{
		return taskType;
	}

	@PlanningVariable(valueRangeProviderRefs = {"machineRange"})
	public Machine getMachine()
	{
		return machine;
	}

	public void setMachine( Machine machine )
	{
		this.machine = machine;
	}

	public double getMachineTiming( String machine )
	{
		return machineTimings.get( machine );
	}

	public void setMachineTiming( String machine, double minutes )
	{
		machineTimings.put( machine, minutes );
	}
}
