package edu.kis.powp.command;

public class SetPositionCommand implements DriverCommand {

    private int x,y;
    @Override
    public void execute() {

    }
    SetPositionCommand(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
}
