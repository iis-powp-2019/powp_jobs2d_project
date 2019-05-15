package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public abstract class AbstractCommand
	implements DriverCommand
{
	protected Job2dDriver driver;
	protected int x;
	protected int y;
	
	public AbstractCommand(Job2dDriver driver, int x, int y)
	{
		this.driver = driver;
		this.x = x;
		this.y = y;
	}
	
}
