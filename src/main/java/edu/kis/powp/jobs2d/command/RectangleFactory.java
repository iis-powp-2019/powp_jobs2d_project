package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class RectangleFactory {

    public static ComplexCommand createRectangle(DriverManager driverManager) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, 100));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 200, 100));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 200, 0));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, 0));

        return complexCommand;
    }
}
