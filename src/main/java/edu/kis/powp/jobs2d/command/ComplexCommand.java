package edu.kis.powp.jobs2d.command;

import java.util.List;

public class ComplexCommand {
    
    private List<DriverCommand> commandList;

    public ComplexCommand() {
    }

    public ComplexCommand(List<DriverCommand> commandList) {
        this.commandList = commandList;
    }

    public void addCommand(DriverCommand driverCommand) {
        commandList.add(driverCommand);
    }

    public void executeCommandList() {
        commandList.forEach(DriverCommand::execute);
    }
}
