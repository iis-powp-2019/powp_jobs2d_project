package edu.kis.powp.command;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class RectangleFactory {

	public static ComplexCommand createRectangle(DriverManager driverManager) {
		ComplexCommand complex = new ComplexCommand();

        DriverCommand driverCommand0 = new SetPositionCommand(driverManager.getCurrentDriver(), 0, 0);
        complex.addCommand(driverCommand0);
        DriverCommand driverCommand1 = new OperateToCommand(driverManager.getCurrentDriver(), 0, 100);
        complex.addCommand(driverCommand1);
		DriverCommand driverCommand2 = new OperateToCommand(driverManager.getCurrentDriver(), 100, 100);
		complex.addCommand(driverCommand2);
		DriverCommand driverCommand4 = new OperateToCommand(driverManager.getCurrentDriver(), 100, 0);
		complex.addCommand(driverCommand4);
		DriverCommand driverCommand5 = new OperateToCommand(driverManager.getCurrentDriver(), 0, 0);
		complex.addCommand(driverCommand5);

		return complex;
	}
}
