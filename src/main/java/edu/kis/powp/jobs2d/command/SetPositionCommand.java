package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private int x, y;

    @Override
    public void execute(Job2dDriver job2dDriver) {
        job2dDriver.operateTo(x, y);
    }

}
