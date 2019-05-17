package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.DriverCommandExtend;

public class SetPositionCommand extends DriverCommandExtend
{
    public SetPositionCommand(Job2dDriver j2dd)
    {
        job2dDriver = j2dd;
        x = 0;
        y = 0;
    }

    public SetPositionCommand(Job2dDriver j2dd, int X, int Y)
    {
        job2dDriver = j2dd;
        x = X;
        y = Y;
    }

    @Override
    public void execute()
    {
        job2dDriver.setPosition(x, y);
    }
}
