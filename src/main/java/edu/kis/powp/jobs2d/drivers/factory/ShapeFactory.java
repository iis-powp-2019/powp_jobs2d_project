package edu.kis.powp.jobs2d.drivers.factory;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class ShapeFactory {

    public static DriverCommand getShape(DriverManager driverManager, String shape) {

        ComplexCommand complexCommand = new ComplexCommand();

        switch (shape) {
            case "RECTANGLE":
                complexCommand.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(),0, 0));
                complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 100, 0));
                complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(),100, 100));
                complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(),0, 100));
                complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, 0));

                return complexCommand;
            case "TRIANGLE":
                complexCommand.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(),0, 0));
                complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(),100, 0));
                complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 50, 86));
                complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(),0, 0));

                return complexCommand;
            default:
                return complexCommand;
        }
    }

}
