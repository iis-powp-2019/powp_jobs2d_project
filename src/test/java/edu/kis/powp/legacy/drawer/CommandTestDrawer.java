package edu.kis.powp.legacy.drawer;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.LoggerDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class CommandTestDrawer {

    public static void main(String[] args) {
        Job2dDriver driver = new LoggerDriver();

        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(driver));
        complexCommand.addCommand(new OperateToCommand(driver,5,5));
        complexCommand.addCommand(new OperateToCommand(driver, 10,20));

        complexCommand.execute();
    }
}
