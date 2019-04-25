package edu.kis.powp.jobs2d.Command;

import java.util.List;

public class ComplexCommand implements DriverCommand {
    private List<DriverCommand> commandsOfTheDriver;

    public ComplexCommand(List<DriverCommand> commandsOfTheDriver) {
        this.commandsOfTheDriver = commandsOfTheDriver;
    }

    public void execute() {
        commandsOfTheDriver.forEach(DriverCommand::execute);
    }
}
