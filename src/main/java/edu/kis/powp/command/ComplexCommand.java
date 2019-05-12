package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> commands = new ArrayList<>();

    public ComplexCommand(List<DriverCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        commands.forEach(command -> {
            command.execute();
        });
    }
}
