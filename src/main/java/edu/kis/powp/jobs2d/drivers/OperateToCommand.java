package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

public class OperateToCommand implements DriverCommand
{
    public Job2dDriver job2dDriver = null;
    public int x;
    public int y;

    public OperateToCommand(Job2dDriver j2dd)
    {
        job2dDriver = j2dd;
        x = 0;
        y = 0;
    }

    @Override
    public void execute()
    {
        job2dDriver.operateTo(x, y);
    }
}
