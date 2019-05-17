package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.DriverCommandExtend;

import java.util.*;

public class ComplexCommand implements DriverCommand
{
    public Queue<DriverCommand> commands = new ArrayDeque<>();

    @Override
    public void execute()
    {
        for(DriverCommand c : commands)
            c.execute();
    }
}

