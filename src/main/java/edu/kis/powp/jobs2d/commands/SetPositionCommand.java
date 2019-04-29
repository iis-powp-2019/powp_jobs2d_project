package edu.kis.powp.jobs2d.commands;

public class SetPositionCommand implements DriverCommand{
    final private int x;
    final private int y;

    public SetPositionCommand()
    {
        this.x = 0;
        this.y = 0;
    }

    public SetPositionCommand(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute()
    {
        
    }
}
