package edu.kis.powp.jobs2d.drivers.command;

public class OperateToCommand
		extends AbstractCommand
{
	
	@Override
	public void execute()
	{
		driver.operateTo(x, y);
	}
}
