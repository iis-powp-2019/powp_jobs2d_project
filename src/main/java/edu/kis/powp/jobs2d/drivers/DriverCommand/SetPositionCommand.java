package edu.kis.powp.jobs2d.drivers.DriverCommand;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    int x;
    int y;

    public SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void execute(Job2dDriver driver){
            driver.setPosition(x, y);
    }
}
