package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class FigureFactory {

	public static DriverCommand triangle(DriverManager driverManager) {
		ComplexCommand complex = new ComplexCommand();
		complex.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(), 0, 0));
		complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 45, -45));
		complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), -45, -45));
		complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, 0));
		return complex;
	}

	public static DriverCommand square(DriverManager driverManager) {
		ComplexCommand complex = new ComplexCommand();
		complex.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(), 0, 0));
		complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 45, -45));
		complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, -90));
		complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), -45, -45));
		complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, 0));
		return complex;
	}

}
