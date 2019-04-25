package edu.kis.powp.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
    private ArrayList<DriverCommand> commandsList;

    public ComplexCommand(ArrayList<DriverCommand> commandsList) {
        this.commandsList = commandsList;
    }

    @Override
    public void execute() {
        for(DriverCommand driverCommand : commandsList) {
            driverCommand.execute();
        }
    }
}
