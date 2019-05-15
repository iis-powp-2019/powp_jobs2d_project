package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

    private Job2dDriver j2d;
    public int x;
    public int y;

    public OperateToCommand(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override public void execute(Job2dDriver j2d) {
        this.j2d = j2d;
        j2d.operateTo(x, y);
    }
}
