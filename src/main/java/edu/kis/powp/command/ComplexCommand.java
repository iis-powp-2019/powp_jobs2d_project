package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> commandsList;

    public ComplexCommand(List list)
    {
        commandsList = list;
    }
    @Override
    public void execute() {
        for(DriverCommand command : commandsList)
            command.execute();
    }

}
