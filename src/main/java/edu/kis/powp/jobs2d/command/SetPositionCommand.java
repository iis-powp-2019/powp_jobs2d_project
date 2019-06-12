package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SetPositionCommand implements DriverCommand {
    int x, y;
    public Job2dDriver job2dDriver;

    public SetPositionCommand(int x, int y, Job2dDriver job2dDriver){
        this.x = x;
        this.y = y;
        this.job2dDriver = job2dDriver;
        execute();
    }

    @Override
    public void execute() {
        job2dDriver.setPosition(x, y);
    }
}
