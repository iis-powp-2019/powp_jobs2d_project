package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ShapeFactory 
{
	private Job2dDriver driver;

	public ShapeFactory(Job2dDriver driver)
	{
		this.driver = driver;
	}

	public DriverCommand drawSquare(int x, int y, int z, int k)
	{
		ComplexCommand cc = new ComplexCommand();

		cc.addCommand(new SetPositionCommand(x,y,driver));
		cc.addCommand(new OperateToCommand(x,y+k,driver));
		cc.addCommand(new OperateToCommand(x+z,y+k,driver));
		cc.addCommand(new OperateToCommand(x+z,y,driver));
		cc.addCommand(new OperateToCommand(x,y,driver));

		return cc;
	}
}