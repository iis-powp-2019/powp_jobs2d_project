package edu.kis.powp.jobs2d.commands;

public class OperateToCommand implements DriverCommand{
    final private int x;
    final private int y;

    public OperateToCommand()
    {
        this.x = 0;
        this.y = 0;
    }

    public OperateToCommand(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute()
    {

    }
}
