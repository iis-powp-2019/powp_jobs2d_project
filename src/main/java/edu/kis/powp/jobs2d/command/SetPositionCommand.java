package edu.kis.powp.jobs2d.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    private int x, y;
    private Job2dDriver job2dDriver;

    public SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        this.job2dDriver.setPosition(x, y);
    }
}
