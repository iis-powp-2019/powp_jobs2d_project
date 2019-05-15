package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {


    public int x;
    public int y;
    private Job2dDriver j2d;

    public SetPositionCommand(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override public void execute(Job2dDriver j2d) {
        this.j2d = j2d;
        j2d.setPosition(this.x, this.y);
    }
}
