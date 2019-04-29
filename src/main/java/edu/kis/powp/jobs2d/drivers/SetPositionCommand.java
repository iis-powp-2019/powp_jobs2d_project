package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
	private int x;
	private int y;

	public SetPositionCommand(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		DriverManager driverManager = new DriverManager();
		Job2dDriver jobs2dDriver = driverManager.getCurrentDriver();
		jobs2dDriver.setPosition(x, y);
	}

}
