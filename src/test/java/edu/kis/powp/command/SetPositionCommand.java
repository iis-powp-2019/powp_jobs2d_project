package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

    Job2dDriver job2dDriver;
    private int x,y;
    @Override
    public void execute(Job2dDriver job2dDriver) {
    job2dDriver.operateTo(this.x,this.y);
    }
    SetPositionCommand(int x, int y)
    {
        this.x=x;
        this.y=y;

    }


}
