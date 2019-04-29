package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand 
{
    private int x;
    private int y;

    public OperateToCommand(int x, int y) 
    {
	    this.setX(x);
	    this.setY(y);
    }
	
    @Override
    public void execute()
    {
        DriverManager driverManager = new DriverManager();
        Job2dDriver job2dDriver = driverManager.getCurrentDriver();
        job2dDriver.operateTo(getX(), getY());
    }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}