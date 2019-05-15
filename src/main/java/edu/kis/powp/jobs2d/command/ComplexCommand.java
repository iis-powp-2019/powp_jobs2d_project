package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> commandList;

    public ComplexCommand() {
        commandList = new ArrayList<>();
    }

    public ComplexCommand(List<DriverCommand> commandList) {
        this.commandList = commandList;
    }

    public void addCommand(DriverCommand driverCommand) {
        commandList.add(driverCommand);
    }

    @Override
    public void execute() {
        commandList.forEach(DriverCommand::execute);
    }
}
