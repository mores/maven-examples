package org.test;

import org.junit.Test;

public class CloudTest
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( CloudTest.class );

	@Test
	public void testOne() throws Exception
	{
		log.info( "testOne" );

		java.util.List<Machine> machineList = new java.util.ArrayList<>();
		int machineid = 0;
		for( int x = 0; x < 20; x++ )
		{
			// 			 $0.10 per hour / 3.6 minutes to startup
			machineList.add( new Machine( 0.100/60.0, 3.6, "m4.large", machineid ) );
			machineid++;
			machineList.add( new Machine( 0.200/60.0, 2.6, "m4.xlarge", machineid ) );
			machineid++;
			machineList.add( new Machine( 0.100/60.0, 2.3, "c4.large", machineid ) );
			machineid++;
			machineList.add( new Machine( 0.199/60.0, 2.3, "c4.xlarge", machineid ) );
			machineid++;
			machineList.add( new Machine( 0.398/60.0, 3.2, "c4.2xlarge", machineid ) );
			machineid++;
		}

		java.util.List<Task> tasks = new java.util.ArrayList<>();
		int taskid = 1;
		for( int imageid = 1322; imageid <= 1599; imageid++ )
		{
			Task t = new Task( String.valueOf(imageid), taskid );
			t.setMachineTiming( "m4.large", 2.65 );
			t.setMachineTiming( "m4.xlarge", 1.60 );
			t.setMachineTiming( "c4.large", 2.55 );
			t.setMachineTiming( "c4.xlarge", 1.50 );
			t.setMachineTiming( "c4.2xlarge", 1.09 );
			tasks.add( t );	
			taskid++;
		}

		log.info( "Total Number of tasks in: " + tasks.size() );

		org.optaplanner.core.api.solver.SolverFactory<CloudPlanner> solverFactory = org.optaplanner.core.api.solver.SolverFactory.createFromXmlResource( "simpleCloudPlannerConfig.xml" ); 
		org.optaplanner.core.api.solver.Solver<CloudPlanner> solver = solverFactory.buildSolver();

		CloudPlanner unsolvedCloudPlanner = new CloudPlanner();
		unsolvedCloudPlanner.setMachineList( machineList );
		unsolvedCloudPlanner.setTaskList( tasks );

		CloudPlanner solvedCloudPlanner = solver.solve( unsolvedCloudPlanner );

		/*
		log.info( "Best plan: " );
		for( Task task : solvedCloudPlanner.getTaskList() )
		{
			log.info( task.getTaskType() + " - " + task.getMachine().getConfiguration() );
		}
		*/

		int numberMachinesWithoutTask = 0;

		double totalCost = 0.0;
		double maxTime = 0.0;
		java.util.Map<Machine, java.util.List<Task>> machineTasks = new java.util.HashMap<>();
		log.info( "Total Number of tasks out: " + solvedCloudPlanner.getTaskList().size() );
		for( Task task : solvedCloudPlanner.getTaskList() )
		{
			if( task.getMachine() != null )
			{
				if(! machineTasks.containsKey( task.getMachine() ) )
				{
					machineTasks.put(task.getMachine(), new java.util.LinkedList<Task>());
				}
				machineTasks.get(task.getMachine()).add(task);
			}
			else
			{
				numberMachinesWithoutTask++;
			}
		}

		log.info( "numberMachinesWithoutTask: " + numberMachinesWithoutTask );
		if( numberMachinesWithoutTask > 0 )
		{
			log.error( "Not all tasks are complete - consider raising the time !!" );
			return;
		}

		for( Machine machine : machineTasks.keySet() )
		{
			double time = machine.getStartupTime();
			for( Task task : machineTasks.get( machine ) )
			{
				time += task.getMachineTiming(machine.getConfiguration());
			}
			double cost = time * machine.getCost();
			System.out.format( "Machine time for %s: " + "%.2f min (cost: $%.4f), tasks: %d\n", machine.getConfiguration(), time, cost, machineTasks.get(machine).size());
			totalCost += cost;
			if( time > maxTime)
			{
				maxTime = time;
			}
			//System.out.println("------");
			//System.out.println("Machine count: " + machineTasks.keySet().size());
		}
		System.out.format("Total cost:  $%.2f\n", totalCost);
		System.out.format("Total time (run in parallel): %.2f\n", maxTime);

	}
}
