package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand{

    public void execute(int x, int y, Job2dDriver driver) {
        driver.operateTo(x,y);
    }
}
