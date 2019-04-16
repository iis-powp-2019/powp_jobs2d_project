package edu.kis.powp.command;

import java.util.LinkedList;
import java.util.List;

public class ComplexCommand implements DriverCommand{

    private List<DriverCommand> commandList;

    public ComplexCommand() {
        commandList = new LinkedList<>();
    }

    public ComplexCommand(List<DriverCommand> commandList) {
        this.commandList = commandList;
    }

    public void addCommand(DriverCommand command) {
        commandList.add(command);
    }

    public void execute() {
        commandList.forEach(DriverCommand::execute);
    }
}
