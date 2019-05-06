package edu.kis.powp.command;

import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> listOfCommand;

    public ComplexCommand(List<DriverCommand> list) {
        listOfCommand = list;
    }

    @Override public void execute() {
        for (DriverCommand command : listOfCommand) {
            command.execute();
        }
    }
}
