package org.test;

import org.optaplanner.core.api.domain.solution.PlanningSolution;

import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;

import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;

import org.optaplanner.core.api.domain.solution.PlanningScore;

@PlanningSolution
public class CloudPlanner
{
	private java.util.List<Machine> machineList;
	private java.util.List<Task> taskList;
	private org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score;

	@ValueRangeProvider( id = "machineRange" )
	@ProblemFactCollectionProperty
	public java.util.List<Machine> getMachineList()
	{
		return machineList;
	}

	public void setMachineList( java.util.List<Machine> machineList )
	{
		this.machineList = machineList;
	}

	@PlanningEntityCollectionProperty
	public java.util.List<Task> getTaskList()
	{
		return taskList;
	}

	public void setTaskList( java.util.List<Task> taskList )
	{
		this.taskList = taskList;
	}

	@PlanningScore
	public org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore getScore()
	{
		return score;
	}

	public void setScore( org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score )
	{
		this.score = score;
	}
}
