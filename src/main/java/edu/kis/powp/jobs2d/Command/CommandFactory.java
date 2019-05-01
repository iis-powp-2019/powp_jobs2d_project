package edu.kis.powp.jobs2d.Command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {
    public static List<DriverCommand> drawSquare(Job2dDriver job2dDriver) {
        List<DriverCommand> commands = new ArrayList<>();

        commands.add(new SetPositionCommand(-50,-50, job2dDriver));
        commands.add(new OperateToCommand(-50,50, job2dDriver));
        commands.add(new OperateToCommand(50,50, job2dDriver));
        commands.add(new OperateToCommand(50,-50, job2dDriver));
        commands.add(new OperateToCommand(-50,-50, job2dDriver));

        return commands;
    }

    public static List<DriverCommand> drawTriangle(Job2dDriver job2dDriver) {
        List<DriverCommand> commands = new ArrayList<>();

        commands.add(new SetPositionCommand(-50,-50, job2dDriver));
        commands.add(new OperateToCommand(50,-50, job2dDriver));
        commands.add(new OperateToCommand(0,50, job2dDriver));
        commands.add(new OperateToCommand(-50,-50, job2dDriver));

        return commands;
    }

    public static List<DriverCommand> drawRectangle(Job2dDriver job2dDriver) {
        List<DriverCommand> commands = new ArrayList<>();

        commands.add(new SetPositionCommand(-50,50, job2dDriver));
        commands.add(new OperateToCommand(50,50, job2dDriver));
        commands.add(new OperateToCommand(50,-150, job2dDriver));
        commands.add(new OperateToCommand(-50,-150, job2dDriver));
        commands.add(new OperateToCommand(-50,50, job2dDriver));

        return commands;
    }
}
