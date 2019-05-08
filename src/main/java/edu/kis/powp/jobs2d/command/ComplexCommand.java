package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand
{
    private List<DriverCommand> commands;

    public ComplexCommand()
    {
        commands = new ArrayList<>();
    }

    public void QueueCommand(DriverCommand command)
    {
        commands.add(command);
    }

    @Override
    public void execute()
    {
        for (DriverCommand comm : commands)
            comm.execute();
    }
}
