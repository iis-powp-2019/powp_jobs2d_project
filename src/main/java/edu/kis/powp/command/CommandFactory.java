package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.Arrays;

public class CommandFactory {

    public static DriverCommand getTriangleCommand(Job2dDriver currentDriver) {
        return new ComplexCommand(Arrays.asList(
                new SetPositionCommand(currentDriver, 0, 50),
                new OperateToCommand(currentDriver, 100, -20),
                new OperateToCommand(currentDriver, -100, -20),
                new OperateToCommand(currentDriver, 0, 50)
        ));
    }

    public static DriverCommand getHexagonCommand(Job2dDriver currentDriver) {
        return new ComplexCommand(Arrays.asList(
                new SetPositionCommand(currentDriver, -40, 40),
                new OperateToCommand(currentDriver, 40, 40),
                new OperateToCommand(currentDriver, 65, 0),
                new OperateToCommand(currentDriver, 40, -40),
                new OperateToCommand(currentDriver, -40, -40),
                new OperateToCommand(currentDriver, -65, 0),
                new OperateToCommand(currentDriver, -40, 40)
        ));
    }
}
