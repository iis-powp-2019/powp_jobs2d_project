package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;

public class ComplexCommand {
    private ArrayList<DriverCommand> commands;

    public ComplexCommand() {
        commands = new ArrayList<>();
    }

    public ComplexCommand(ArrayList<DriverCommand> commands) {
        this.commands = commands;
    }

    public void add(DriverCommand command) {
        commands.add(command);
    }

    public void execute() {
        commands.forEach(DriverCommand::execute);
    }
}
