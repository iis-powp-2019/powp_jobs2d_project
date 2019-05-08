package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

	private int x;
	private int y;
	
	@Override
	public void execute( Job2dDriver _object ) {
		_object.operateTo(this.x, this.y);
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
