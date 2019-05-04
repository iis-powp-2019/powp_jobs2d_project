package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> commandsList = new ArrayList<>();

    public void addCommand(DriverCommand driver) {
        commandsList.add(driver);
    }

    @Override
    public void execute() {
        for (DriverCommand command : commandsList) {
            command.execute();
        }

    }

}