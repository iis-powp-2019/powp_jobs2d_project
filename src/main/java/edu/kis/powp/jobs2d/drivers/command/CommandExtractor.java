package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandExtractor
		implements Job2dDriver
{
	private ComplexCommand command;
	
	@Override
	public void setPosition(int i, int i1)
	{
		command.enqueue(new SetPositionCommand(null, i, i1));
	}
	
	@Override
	public void operateTo(int i, int i1)
	{
		command.enqueue(new SetPositionCommand(null, i, i1));
	}
	
	public DriverCommand getCommand()
	{
		return command;
	}
	
}
