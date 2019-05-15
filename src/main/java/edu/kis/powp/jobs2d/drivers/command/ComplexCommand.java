package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayDeque;
import java.util.Queue;

public class ComplexCommand
		implements DriverCommand
{
	private Queue<DriverCommand> q = new ArrayDeque<>();
	
	public void enqueue(DriverCommand next)
	{
		q.add(next);
	}
	
	@Override
	public void execute()
	{
		for(DriverCommand comm : q)
			comm.execute();
	}
}
