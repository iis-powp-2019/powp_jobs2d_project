package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    int x;
    int y;
    @Override
    public void execute(Job2dDriver job2dDriver) {
        job2dDriver.operateTo(this.x,this.y);
    }

    public SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
