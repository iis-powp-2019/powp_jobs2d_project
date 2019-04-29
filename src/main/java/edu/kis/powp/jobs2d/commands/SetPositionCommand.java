package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    final private int x;
    final private int y;
    private Job2dDriver driver;

    public SetPositionCommand()
    {
        this.x = 0;
        this.y = 0;
    }

    public SetPositionCommand(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute()
    {
        driver.setPosition(x, y);
    }
}
