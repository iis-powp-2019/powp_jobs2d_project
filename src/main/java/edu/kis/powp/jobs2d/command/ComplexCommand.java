package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {

    ArrayList<DriverCommand> commands;

    public ComplexCommand(ArrayList<DriverCommand> commands) {
        this.commands = commands;
    }

    @Override public void execute() {
        commands.forEach(DriverCommand::execute);
    }
}
