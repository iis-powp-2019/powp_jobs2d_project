package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public abstract class AbstractCommand
	implements DriverCommand
{
	public Job2dDriver driver;
	public int x;
	public int y;
}
