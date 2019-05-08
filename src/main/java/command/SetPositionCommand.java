package command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

    private int x, y;
    private Job2dDriver job2dDriver;

    SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override public void execute() {
        job2dDriver.setPosition(x, y);
    }
}
