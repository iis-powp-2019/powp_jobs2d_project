package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public interface DriverCommand
{
	public class DriverException extends Error {}
	
	void setDriver(Job2dDriver driver);
	void execute();
}
