package edu.kis.powp.command;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class RectangleFactory {

    public static ComplexCommand createRectangle(DriverManager driverManager) {
        ComplexCommand complex = new ComplexCommand();

        DriverCommand driverCommand = new SetPositionCommand(driverManager.getCurrentDriver(), 0, 0);
        DriverCommand driverCommand1 = new OperateToCommand(driverManager.getCurrentDriver(), 0, 100);
        DriverCommand driverCommand2 = new OperateToCommand(driverManager.getCurrentDriver(), 100, 100);
        DriverCommand driverCommand3 = new OperateToCommand(driverManager.getCurrentDriver(), 100, 0);
        DriverCommand driverCommand4 = new OperateToCommand(driverManager.getCurrentDriver(), 0, 0);

        complex.addCommand(driverCommand);
        complex.addCommand(driverCommand1);
        complex.addCommand(driverCommand2);
        complex.addCommand(driverCommand3);
        complex.addCommand(driverCommand4);

        return complex;
    }
}