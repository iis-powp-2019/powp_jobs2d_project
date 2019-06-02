package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

	private int x;
	private int y;
	Job2dDriver driver;
	
	public SetPositionCommand( Job2dDriver _driver ) {
		this.driver = _driver;
	}
	
	@Override
	public void execute() {
		this.driver.setPosition(this.x, this.y);
	}
	
	public SetPositionCommand setX( int _x ) {
		this.x = _x;
		
		return this;
	}
	
	public SetPositionCommand setY( int _y ) {
		this.y = _y;
		
		return this;
	}
	
}
