package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand{

    Job2dDriver job2dDriver;
    private int x;
    private int y;

    public OperateToCommand(Job2dDriver job2dDriver, int x, int y){
        this.x = x;
        this.y = y;
        this.job2dDriver = job2dDriver;
    }

    @Override
    public void execute() {
        job2dDriver.operateTo(x, y);
    }
}
