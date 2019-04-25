package edu.kis.powp.jobs2d.command;

import java.util.List;
import java.util.function.Function;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> commands;

    ComplexCommand(List<DriverCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        commands.forEach(DriverCommand::execute);
    }
}
