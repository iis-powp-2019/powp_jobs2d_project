package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private Integer x = 0;
    private Integer y = 0;
    private Job2dDriver driver;

    SetPositionCommand(Job2dDriver driver)
    {
        this.driver = driver;
    }

    public void setCoordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        driver.operateTo(x,y);
    }


}
