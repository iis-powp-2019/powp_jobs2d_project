package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

    private int x, y;
    private Job2dDriver job2dDriver;

    OperateToCommand(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override public void execute() {
        job2dDriver.operateTo(x,y);
    }
}
