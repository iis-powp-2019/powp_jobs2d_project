package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> commands;
    public List<DriverCommand> getCommands() {
        return new LinkedList<>(this.commands);
    }

    ComplexCommand() {
        this.commands = new LinkedList<>();
    }

    ComplexCommand(DriverCommand ... commands) {
        this.commands = new LinkedList<>(Arrays.asList(commands));
    }

    ComplexCommand(List<DriverCommand> commands) {
        this.commands = commands;
    }

    public void addCommand(DriverCommand command) {
        this.commands.add(command);
    }

    public DriverCommand removeCommand(int i) {
        return this.commands.remove(i);
    }

    @Override
    public void setDriver(Job2dDriver driver) {
        this.commands
                .forEach(driverCommand -> driverCommand.setDriver(driver));
    }

    @Override
    public void execute() {
        this.commands.forEach(DriverCommand::execute);
    }

    @Override
    public void execute(Job2dDriver driver) {
        this.commands
                .forEach(driverCommand -> driverCommand.execute(driver));
    }
}
