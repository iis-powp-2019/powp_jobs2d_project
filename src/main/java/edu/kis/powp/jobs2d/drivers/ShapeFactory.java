package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ShapeFactory 
{
	private Job2dDriver driver;
	
	public ShapeFactory(Job2dDriver driver)
	{
		this.driver = driver;
	}
	
	public DriverCommand createRectangle(int x, int y, int w, int h)
	{
		ComplexCommand cc = new ComplexCommand();

		cc.addCommand(new SetPositionCommand(x,y,driver));
		cc.addCommand(new OperateToCommand(x,y+h,driver));
		cc.addCommand(new OperateToCommand(x+w,y+h,driver));
		cc.addCommand(new OperateToCommand(x+w,y,driver));
		cc.addCommand(new OperateToCommand(x,y,driver));
		
		return cc;
	}
}
