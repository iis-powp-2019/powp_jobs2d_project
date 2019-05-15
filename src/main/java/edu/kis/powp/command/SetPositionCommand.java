package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    private int x, y;
    Job2dDriver job2dDriver;

    SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void execute() {
        job2dDriver.setPosition(x, y);
    }
}
