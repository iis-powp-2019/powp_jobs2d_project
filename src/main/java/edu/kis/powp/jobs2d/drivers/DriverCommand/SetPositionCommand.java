package edu.kis.powp.jobs2d.drivers.DriverCommand;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    Job2dDriver driver;
    int x;
    int y;

    public SetPositionCommand(Job2dDriver driver, int x, int y) {
        this.driver = driver;
        this.x = x;
        this.y = y;
    }

    public void execute(){
            driver.setPosition(x, y);
    }
}
