package edu.kis.powp.command;

import java.util.List;

public class ComplexCommand implements DriverCommand  {

    private List<DriverCommand> driverCommands;


    public ComplexCommand(List<DriverCommand> driverCommands) {
        this.driverCommands = driverCommands;
    }

    @Override
    public void execute() {
        driverCommands.forEach(DriverCommand::execute);
    }
}
