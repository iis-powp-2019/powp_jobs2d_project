package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> commandList;
    private Job2dDriver job2dDriver;

    public ComplexCommand(List<DriverCommand> commandList, Job2dDriver job2dDriver) {
        this.commandList = commandList;
        this.job2dDriver = job2dDriver;

    }

    @Override public void execute() {
        for (DriverCommand command : commandList) {
            command.execute();
        }
    }

}
