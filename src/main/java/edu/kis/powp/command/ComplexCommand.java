package edu.kis.powp.command;

import java.util.Arrays;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    List<DriverCommand> commandList;

    public ComplexCommand(List<DriverCommand> commandList) {
        this.commandList = commandList;
    }

    public ComplexCommand(DriverCommand... commands) {
        this(Arrays.asList(commands));
    }

    @Override
    public void execute() {
        for(DriverCommand command: commandList) {
            command.execute();
        }
    }
}
