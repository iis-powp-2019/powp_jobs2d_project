package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

public class FactoryCommand
{
    public DriverCommand Rect(Job2dDriver j2dd, int x, int y, int w, int h)
    {
        ComplexCommand result = new ComplexCommand();

        result.commands.add(new SetPositionCommand(j2dd, x, y));
        result.commands.add(new OperateToCommand(j2dd, x + w, y));
        result.commands.add(new OperateToCommand(j2dd, x + w, y + h));
        result.commands.add(new OperateToCommand(j2dd, x, y + h));
        result.commands.add(new OperateToCommand(j2dd, x, y));

        return result;
    }

    public DriverCommand Circle(Job2dDriver j2dd, int x, int y, int r)
    {
        ComplexCommand result = new ComplexCommand();

        result.commands.add(new SetPositionCommand(j2dd, (int)(x + Math.cos(0) * r), (int)(y + Math.sin(1))));
        for(float a = 0; a <= Math.PI * 2; a += 0.02f)
        {
            result.commands.add(new OperateToCommand(j2dd, (int)(r * Math.cos(a)) + x, (int)(r * Math.sin(a))+ y));
        }

        return result;
    }

}
