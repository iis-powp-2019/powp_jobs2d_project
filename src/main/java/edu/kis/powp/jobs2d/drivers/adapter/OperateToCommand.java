package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.drivers.DriverCommand;

public class OperateToCommand implements DriverCommand
{
    int x;
    int y;

    @Override
    public void execute()
    {
        job2dDriver.operateTo(x, y);
    }
}
