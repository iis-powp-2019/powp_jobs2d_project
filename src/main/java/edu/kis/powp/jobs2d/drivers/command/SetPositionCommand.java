package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.features.DriverFeature;

public class SetPositionCommand
		extends AbstractCommand
{
	
	@Override
	public void execute()
	{
		driver.setPosition(x, y);
	}
}
