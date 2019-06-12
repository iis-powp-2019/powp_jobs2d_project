package edu.kis.powp.jobs2d.command;

import java.util.Arrays;

import edu.kis.powp.jobs2d.Job2dDriver;

public class Factory {

    public static DriverCommand triangleFactory(Job2dDriver currentDriver) {
        return new ComplexCommand(Arrays.asList(
                new SetPositionCommand(currentDriver, 0, 0),
                new OperateToCommand(currentDriver, 100, 80),
                new OperateToCommand(currentDriver, -100, 80),
                new OperateToCommand(currentDriver, 0, 0)
        ));
    }
    public static DriverCommand rectangleFactory(Job2dDriver currentDriver) {
        return new ComplexCommand(Arrays.asList(
                new SetPositionCommand(currentDriver, 0, 0),
                new OperateToCommand(currentDriver, 100, 0),
                new OperateToCommand(currentDriver, 100, 50),
                new OperateToCommand(currentDriver, 0, 50),
                new OperateToCommand(currentDriver, 0, 0)
        ));
    }
}
