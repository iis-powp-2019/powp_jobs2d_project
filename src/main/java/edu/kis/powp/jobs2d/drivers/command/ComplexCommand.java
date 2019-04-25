package edu.kis.powp.jobs2d.drivers.command;

import java.util.List;

public class ComplexCommand {

    private List<DriverCommand> driverCommandsList;

    public ComplexCommand(List<DriverCommand> driverCommands) {
        this.driverCommandsList = driverCommands;
    }

    public void execute() {
        driverCommandsList.forEach(DriverCommand::execute);
    }

}
