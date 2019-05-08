package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.Arrays;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    List<DriverCommand> commandList;

    public ComplexCommand(List<DriverCommand> commandList) {
        this.commandList = commandList;
    }

    public ComplexCommand(DriverCommand... commands) {
        this(Arrays.asList(commands));
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        for(DriverCommand command: commandList) {
            command.execute(job2dDriver);
        }
    }
}
