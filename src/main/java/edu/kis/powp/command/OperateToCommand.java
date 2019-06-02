package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

	private int x;
	private int y;
	Job2dDriver driver;
	
	public OperateToCommand( Job2dDriver _driver ) {
		this.driver = _driver;
	}
	
	@Override
	public void execute() {
		this.driver.operateTo(this.x, this.y);
	}
	
	public OperateToCommand setX( int _x ) {
		this.x = _x;
		
		return this;
	}
	
	public OperateToCommand setY( int _y ) {
		this.y = _y;
		
		return this;
	}
	
}
