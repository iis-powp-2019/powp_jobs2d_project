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
	
    public DriverCommand createCircle(int x, int y ,int radius)
    {

		ComplexCommand cc = new ComplexCommand();
        int x_start = x;
        int y_start = y + radius;
        cc.addCommand(new SetPositionCommand(x,y +radius,driver));

        double intern_angle = Math.PI * 2 / 360;
        double angle = intern_angle;
        cc.addCommand(new SetPositionCommand(x_start,y_start,driver));
        for(int i = 0 ; i < 360 ; i++)
        {
            cc.addCommand(new OperateToCommand((int) ((x_start - x) * Math.cos(angle) -(y_start - y)* Math.sin(angle) + x),
            								   (int) ((x_start - x) * Math.sin(angle) +(y_start - y)* Math.cos(angle) + y),driver));
            angle += intern_angle;
        }
		
		return cc;
    }
}
