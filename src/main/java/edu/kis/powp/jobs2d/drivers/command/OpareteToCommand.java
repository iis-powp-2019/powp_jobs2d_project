package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OpareteToCommand implements DriverCommand {
    private int x,y;
    Job2dDriver driver;

    public OpareteToCommand(Job2dDriver driver,int x, int y ) {
        this.x = x;
        this.y = y;
        this.driver = driver;
    }

    @Override
    public void execute() {
        driver.operateTo(x,y);
    }

    public void coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
