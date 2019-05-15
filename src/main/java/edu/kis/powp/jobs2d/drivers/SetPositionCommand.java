package edu.kis.powp.jobs2d.drivers;

public class SetPositionCommand implements DriverCommand
{
    int x;
    int y;

    @Override
    public void execute()
    {
        job2dDriver.setPosition(x, y);
    }
}
