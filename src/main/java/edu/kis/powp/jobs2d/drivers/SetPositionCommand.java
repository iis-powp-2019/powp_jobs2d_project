package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand 
{    
	private int x;
	private int y;
    private Job2dDriver driver;

	public SetPositionCommand(int x, int y, Job2dDriver d) 
	{
	    this.setX(x);
	    this.setY(y);
	    this.driver = d;
	}
	
    @Override
    public void execute() 
    {
        driver.setPosition(getX(), getY());
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