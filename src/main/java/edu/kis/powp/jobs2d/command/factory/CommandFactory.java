package edu.kis.powp.jobs2d.command.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class CommandFactory {
    public static DriverCommand drawRectangle(Job2dDriver driver){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(0,0, driver));
        complexCommand.addCommand(new OperateToCommand(10, 0, driver));
        complexCommand.addCommand(new OperateToCommand(10, 10, driver));
        complexCommand.addCommand(new OperateToCommand(0, 10, driver));
        complexCommand.addCommand(new OperateToCommand(0, 0, driver));

        return complexCommand;
    }

    public static DriverCommand drawTriangle(Job2dDriver driver){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(0,0, driver));
        complexCommand.addCommand(new OperateToCommand(10, 0, driver));
        complexCommand.addCommand(new OperateToCommand(5, 10, driver));
        complexCommand.addCommand(new OperateToCommand(0, 0, driver));

        return complexCommand;
    }
}
