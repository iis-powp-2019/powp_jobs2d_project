package edu.kis.powp.jobs2d.drivers.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {

    public static ComplexCommand drawTriangle() {

        ComplexCommand complexCommand;
        List<DriverCommand> commandList = new ArrayList<>();

        commandList.add(new SetPositionCommand(100, 100));
        commandList.add(new OperateToCommand(100, 100));
        commandList.add(new OperateToCommand(0, 0));
        commandList.add(new OperateToCommand(-100, 100));
        commandList.add(new OperateToCommand(100, 100));

        complexCommand = new ComplexCommand(commandList);

        return complexCommand;
    }

    public static ComplexCommand drawRectangle() {
        ComplexCommand complexCommand;
        List<DriverCommand> commandList = new ArrayList<>();

        commandList.add(new SetPositionCommand(100, 100));
        commandList.add(new OperateToCommand(-100, 100));
        commandList.add(new OperateToCommand(-100, 0));
        commandList.add(new OperateToCommand(100, 0));
        commandList.add(new OperateToCommand(100, 100));

        complexCommand = new ComplexCommand(commandList);

        return complexCommand;
    }
}
