package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;

public class OperateToCommand implements DriverCommand {

    private int x;
    private int y;
    private Job2dDriver j2d;

    public OperateToCommand(Job2dDriver j2d, int x, int y){
        this.x = x;
        this.y = y;
        this.j2d = j2d;
    }

    @Override public void execute() {
        this.j2d.operateTo(x, y);
    }
}
