package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private Integer x = 0;
    private Integer y = 0;
    private Job2dDriver driver;

    public SetPositionCommand(Integer x, Integer y, Job2dDriver driver) {
        this.x = x;
        this.y = y;
        this.driver = driver;
    }

    public SetPositionCommand(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    SetPositionCommand(Job2dDriver driver)
    {
        this.driver = driver;
    }

    public void setCoordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setDriver(Job2dDriver driver) {
        this.driver = driver;
    }

    @Override
    public void execute() {
        driver.setPosition(x,y);
    }


}
