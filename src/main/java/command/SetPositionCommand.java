package command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

    private int x, y;

    SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override public void execute(Job2dDriver object) {
        object.setPosition(x, y);
    }
}
