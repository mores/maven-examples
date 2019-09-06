package org.test;

public class Scorer implements org.optaplanner.core.impl.score.director.easy.EasyScoreCalculator<CloudPlanner>
{
	@Override
	public org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore calculateScore( CloudPlanner cloudPlanner )
	{
		java.util.Map<Machine, java.util.List<Task>> machineTasks = new java.util.HashMap<>();
		for( Task task : cloudPlanner.getTaskList() )
		{
			if( task.getMachine() != null )
			{
				if( ! machineTasks.containsKey(task.getMachine()))
				{
					machineTasks.put(task.getMachine(),new java.util.LinkedList<Task>());
				}
				machineTasks.get(task.getMachine()).add(task);	
			}
		}

		java.util.Map<Machine, Double> machineRuntimes = new java.util.HashMap<>();
		for( Machine machine : machineTasks.keySet() )
		{
			double time = machine.getStartupTime();
			for( Task task : machineTasks.get( machine ) )
			{
				time += task.getMachineTiming(machine.getConfiguration());
			}
			machineRuntimes.put(machine, time );
		}

		double maxRuntime = 0.0;
		double totalCost = 0.0;

		for( Machine machine : machineRuntimes.keySet() )
		{
			if( machineRuntimes.get( machine ) > maxRuntime )
			{
				maxRuntime = machineRuntimes.get( machine );
			}
			totalCost += machineRuntimes.get( machine ) * machine.getCost();
		}

		int hard = 0;
		// $2.0 strict limit
		// hard constraint score below 0
		if( totalCost > 2.0 )
		{
			hard = (int) ( -totalCost * 1000 );
		}
		// desired values - 60 minutes of process, 10 machines, $1.50 cost
		Double[] ratios = {1.0, maxRuntime/60.0, machineRuntimes.keySet().size()/10.0, totalCost/1.50};
		double maxRatio = java.util.Collections.max(java.util.Arrays.asList(ratios));
		int soft = (int)(10000 * (1.0 - maxRatio) );
		return org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore.valueOf( hard, soft ); 
	}
}
