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
	
	public DriverCommand createCircle(int x, int y ,int r){
		ComplexCommand cc = new ComplexCommand();
		
        int x_start = x;
        int y_start = y + r;
        
        cc.addCommand(new SetPositionCommand(x,y +r,driver));

        double inAngle = Math.PI * 2 / 360;
        double angle = inAngle;
        
        cc.addCommand(new SetPositionCommand(x_start,y_start,driver));
        
        for(int i = 0 ; i < 360 ; i++){
            cc.addCommand(new OperateToCommand((int) ((x_start - x) * Math.cos(angle) -(y_start - y)* Math.sin(angle) + x),
            								   (int) ((x_start - x) * Math.sin(angle) +(y_start - y)* Math.cos(angle) + y),driver));
            
            angle += inAngle;
        }

		return cc;
    }
}