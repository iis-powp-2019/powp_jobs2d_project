package edu.kis.powp.jobs2d.command;

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

    @Override
    public void execute() {
        for (DriverCommand command : this.commandList) {
            command.execute();
        }
    }



}
