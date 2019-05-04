package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

	Job2dDriver object;
	private int x;
	private int y;

	public SetPositionCommand(Job2dDriver object, int x, int y) {
		this.x = x;
		this.y = y;
		this.object = object;
	}

	@Override
	public void execute() {
		object.setPosition(x, y);
	}
}
