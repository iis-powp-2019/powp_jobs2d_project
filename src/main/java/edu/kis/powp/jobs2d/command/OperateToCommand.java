package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

    private Job2dDriver job2dDriver;

    public OperateToCommand(Job2dDriver job2dDriver){
        this.job2dDriver = job2dDriver;
    }

    @Override
    public void execute(int x, int y) {
        job2dDriver.operateTo(x, y);
    }

}
