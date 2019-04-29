package edu.kis.powp.jobs2d.drivers;

public class OperateToCommand implements DriverCommand
{
	private int x;
	private int y;
	
	public OperateToCommand(int x, int y) 
	{
		this.x = x;
		this.y = y;
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

	@Override
	public void execute() {
		
	}
}
