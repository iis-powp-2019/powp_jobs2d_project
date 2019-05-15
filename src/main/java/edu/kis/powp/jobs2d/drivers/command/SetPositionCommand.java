package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class SetPositionCommand
		extends AbstractCommand
{
	public SetPositionCommand(Job2dDriver driver, int x, int y)
	{
		super(driver, x, y);
	}
	
	@Override
	public void execute()
	{
		driver.setPosition(x, y);
	}
}
