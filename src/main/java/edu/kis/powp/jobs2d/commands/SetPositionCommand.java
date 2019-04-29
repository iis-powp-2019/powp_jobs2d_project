package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    final private int x;
    final private int y;
    final private Job2dDriver driver;

    public SetPositionCommand(int x, int y, Job2dDriver driver)
    {
        this.x = x;
        this.y = y;
        this.driver = driver;
    }

    @Override
    public void execute()
    {
        driver.setPosition(x, y);
    }
}
