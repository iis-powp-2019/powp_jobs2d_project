package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.Arrays;

public class CommandFactory {
    public static DriverCommand getSquare(Job2dDriver driver)
    {
        DriverCommand driverCommand = new ComplexCommand(Arrays.asList(
                new SetPositionCommand(driver,0,0),
                new OperateToCommand(driver,100,0),
                new OperateToCommand(driver,100,-100),
                new OperateToCommand(driver,0,-100),
                new OperateToCommand(driver,0,0)));
        return driverCommand;

    }

    public static DriverCommand getTriangle(Job2dDriver driver)
    {
        DriverCommand driverCommand = new ComplexCommand(Arrays.asList(
                new SetPositionCommand(driver,0,0),
                new OperateToCommand(driver,100,0),
                new OperateToCommand(driver,50,100),
                new OperateToCommand(driver,0,0)));
        return driverCommand;
    }
}
