package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class CircleFactory {

    public static ComplexCommand createRectangle(DriverManager driverManager, int a, int b) {
        ComplexCommand complexCommand = new ComplexCommand();

        DriverCommand driverCommand = new SetPositionCommand(-a, -b, driverManager.getCurrentDriver());
        DriverCommand driverCommand2 = new OperateToCommand(-a, b, driverManager.getCurrentDriver());
        DriverCommand driverCommand3 = new OperateToCommand(a, b, driverManager.getCurrentDriver());
        DriverCommand driverCommand4 = new OperateToCommand(a, -b, driverManager.getCurrentDriver());
        DriverCommand driverCommand5 = new OperateToCommand(-a, -b, driverManager.getCurrentDriver());

        complexCommand.addCommand(driverCommand);
        complexCommand.addCommand(driverCommand2);
        complexCommand.addCommand(driverCommand3);
        complexCommand.addCommand(driverCommand4);
        complexCommand.addCommand(driverCommand5);

        return complexCommand;
    }
}

