package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{

    public void execute(int x, int y, Job2dDriver driver){
        driver.setPosition(x,y);
    }

}
