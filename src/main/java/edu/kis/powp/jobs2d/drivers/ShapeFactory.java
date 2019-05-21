package edu.kis.powp.jobs2d.drivers;

import command.DriverCommand;
import command.OperateToCommand;
import command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class ShapeFactory {
	private Job2dDriver driver;

	public ShapeFactory(Job2dDriver driver)
	{
		this.driver = driver;
	}
	
	public DriverCommand createCircle(int x, int y ,int r){
		ComplexCommand complexCommand = new ComplexCommand();

        int x_start = x;
        int y_start = y + r;

        complexCommand.addCommand(new SetPositionCommand(driver,x,y +r));

        double inAngle = Math.PI * 2 / 360;
        double angle = inAngle;

        complexCommand.addCommand(new SetPositionCommand(driver,x_start,y_start));

        for(int i = 0 ; i < 360 ; i++){
        	complexCommand.addCommand(new OperateToCommand(
        			driver,
        			(int) ((x_start - x) * Math.cos(angle) -(y_start - y)* Math.sin(angle) + x),
        			(int) ((x_start - x) * Math.sin(angle) +(y_start - y)* Math.cos(angle) + y)));

            angle += inAngle;
        }

		return complexCommand;
    }

	public DriverCommand drawSquare(int x, int y, int z, int k)
	{
		ComplexCommand complexCommand = new ComplexCommand();

		complexCommand.addCommand(new SetPositionCommand(driver,x,y));
		complexCommand.addCommand(new OperateToCommand(driver,x,y+k));
		complexCommand.addCommand(new OperateToCommand(driver,x+z,y+k));
		complexCommand.addCommand(new OperateToCommand(driver,x+z,y));
		complexCommand.addCommand(new OperateToCommand(driver,x,y));

		return complexCommand;
	}

}
