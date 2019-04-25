package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

    private Job2dDriver job2dDriver;
    private int startX = 0, startY = 0;

    public OperateToCommand(Job2dDriver job2dDriver, int startX, int startY) {
        this.job2dDriver = job2dDriver;
        this.startX = startX;
        this.startY = startY;
    }

    @Override public void execute() {
        job2dDriver.operateTo(startX,startY);
    }
}
