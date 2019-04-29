package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> commands;

    public ComplexCommand(){
        commands = new ArrayList<>();
    }

    @Override
    public void execute() {
        for(DriverCommand command : commands){
            command.execute();
        }
    }

    public void addCommand(DriverCommand command){
        commands.add(command);
    }
}
