package edu.kis.powp.jobs2d.drivers.command.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class CommandFactory {

    public static DriverCommand getRectangle(Job2dDriver driver){

        ComplexCommand commands = new ComplexCommand();

        commands.addCommand(new SetPositionCommand(0, 0, driver));
        commands.addCommand(new OperateToCommand(10, 0, driver));
        commands.addCommand(new OperateToCommand(10, 10, driver));
        commands.addCommand(new OperateToCommand(0, 10, driver));
        commands.addCommand(new OperateToCommand(0, 0, driver));

        return commands;

    }

    public static DriverCommand getFrog(Job2dDriver driver){

        ComplexCommand commands = new ComplexCommand();

        // glowa
        commands.addCommand(new SetPositionCommand(-40, -40, driver));
        commands.addCommand(new OperateToCommand(40, -40, driver));
        commands.addCommand(new OperateToCommand(60, -20, driver));
        commands.addCommand(new OperateToCommand(60, -10, driver));
        commands.addCommand(new OperateToCommand(40, 10, driver));
        commands.addCommand(new OperateToCommand(-60, -10, driver));
        commands.addCommand(new OperateToCommand(-60, -20, driver));
        commands.addCommand(new OperateToCommand(-40, -40, driver));

        // oczy
        commands.addCommand(new SetPositionCommand(-40, 10, driver));
        commands.addCommand(new OperateToCommand(-40, 40, driver));
        commands.addCommand(new OperateToCommand(-20, 40, driver));
        commands.addCommand(new OperateToCommand(-10, 30, driver));
        commands.addCommand(new OperateToCommand(-10, 10, driver));

        commands.addCommand(new SetPositionCommand(-30, 10, driver));
        commands.addCommand(new OperateToCommand(-30, 30, driver));
        commands.addCommand(new OperateToCommand(-20, 30, driver));
        commands.addCommand(new OperateToCommand(-20, 10, driver));

        commands.addCommand(new SetPositionCommand(40, 10, driver));
        commands.addCommand(new OperateToCommand(40, 40, driver));
        commands.addCommand(new OperateToCommand(20, 40, driver));
        commands.addCommand(new OperateToCommand(10, 30, driver));
        commands.addCommand(new OperateToCommand(10, 10, driver));

        commands.addCommand(new SetPositionCommand(30, 10, driver));
        commands.addCommand(new OperateToCommand(30, 30, driver));
        commands.addCommand(new OperateToCommand(20, 30, driver));
        commands.addCommand(new OperateToCommand(20, 10, driver));

        //nos
        commands.addCommand(new SetPositionCommand(-10, 0, driver));
        commands.addCommand(new OperateToCommand(-10, -10, driver));

        commands.addCommand(new SetPositionCommand(10, 0, driver));
        commands.addCommand(new OperateToCommand(10, -10, driver));

        //usmiech

        commands.addCommand(new SetPositionCommand(-40, -20, driver));
        commands.addCommand(new OperateToCommand(-30, -30, driver));
        commands.addCommand(new OperateToCommand(20, -30, driver));
        commands.addCommand(new OperateToCommand(30, -20, driver));

        commands.addCommand(new SetPositionCommand(-50, -20, driver));
        commands.addCommand(new OperateToCommand(-30, -20, driver));

        commands.addCommand(new SetPositionCommand(50, -20, driver));
        commands.addCommand(new OperateToCommand(30, -20, driver));

        return commands;

    }

    public static DriverCommand getTriangle(Job2dDriver driver){

        ComplexCommand commands = new ComplexCommand();

        commands.addCommand(new SetPositionCommand(0, 0, driver));
        commands.addCommand(new OperateToCommand(10, 0, driver));
        commands.addCommand(new OperateToCommand(5, 10, driver));
        commands.addCommand(new OperateToCommand(0, 0, driver));

        return commands;

    }

}
