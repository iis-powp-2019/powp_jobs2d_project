package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

    private int x;
    private int y;
    private Job2dDriver driver;
    @Override
    public void execute() {
        driver.setPosition(x,y);
    }

    SetPositionCommand(Job2dDriver driver, int x, int y)
    {
        this.driver = driver;
        this.x = x;
        this.y = y;
    }
}
