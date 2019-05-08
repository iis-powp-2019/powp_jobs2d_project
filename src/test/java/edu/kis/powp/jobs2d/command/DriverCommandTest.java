package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.LoggerDriver;

public class DriverCommandTest {
    public static void main(String[] args) {
        Job2dDriver job2dDriver = new LoggerDriver();
        DriverCommand setPositionCommand = new SetPositionCommand(0,0,job2dDriver);
        DriverCommand operateToCommand = new OperateToCommand(10,10,job2dDriver);
        setPositionCommand.execute();;
        operateToCommand.execute();
    }
}