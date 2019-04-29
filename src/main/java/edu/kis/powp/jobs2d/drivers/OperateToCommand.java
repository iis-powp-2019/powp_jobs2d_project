package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

	int x;
	int y;

	public OperateToCommand(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		DriverManager driverManager = new DriverManager();
        Job2dDriver jobs2dDriver = driverManager.getCurrentDriver();
        jobs2dDriver.operateTo(x, y);
	}

}
