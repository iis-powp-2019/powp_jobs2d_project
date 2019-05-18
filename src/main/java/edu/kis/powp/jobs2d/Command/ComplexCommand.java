package edu.kis.powp.jobs2d.Command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.List;

public class ComplexCommand implements DriverCommand {

    private Job2dDriver job2dDriver;
    private List<DriverCommand> commandList;

    public ComplexCommand(Job2dDriver job2dDriver, List<DriverCommand> commandList) {
        this.job2dDriver = job2dDriver;
        this.commandList = commandList;
    }


    @Override
    public void execute() {
        commandList.forEach(command -> command.execute());
    }
}
