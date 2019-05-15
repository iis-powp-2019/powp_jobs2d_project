package edu.kis.powp.jobs2d.drivers.Command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private int x;
    private int y;
    private Job2dDriver driver;

    public void setDriver(Job2dDriver driver) {
        this.driver = driver;
    }

    public SetPositionCommand(int x, int y, Job2dDriver driver){
        this.driver = driver;
        this.x = x;
        this.y = y;
    }
    @Override
     public void execute() {
        driver.setPosition(this.x,this.y);
    }
}
