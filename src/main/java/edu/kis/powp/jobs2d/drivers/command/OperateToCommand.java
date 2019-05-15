package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand
		extends AbstractCommand
{
	
	public OperateToCommand(Job2dDriver driver, int x, int y)
	{
		super(driver, x, y);
	}
	
	@Override
	public void execute()
	{
		if(driver == null)
			throw new DriverException();
		driver.operateTo(x, y);
	}
}
