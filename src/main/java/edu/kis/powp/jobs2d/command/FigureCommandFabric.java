package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class FigureCommandFabric
{
    public static ComplexCommand DrawSquareCommand(Job2dDriver driver)
    {
        ComplexCommand command = new ComplexCommand();
        command.QueueCommand(new SetPositionCommand(0, 0, driver));
        command.QueueCommand(new OperateToCommand(100, 0, driver));
        command.QueueCommand(new OperateToCommand(100, 100, driver));
        command.QueueCommand(new OperateToCommand(0, 100, driver));
        command.QueueCommand(new OperateToCommand(0, 0, driver));
        return command;
    }

    public static ComplexCommand DrawTriangleCommand(Job2dDriver driver)
    {
        ComplexCommand command = new ComplexCommand();
        command.QueueCommand(new SetPositionCommand(0, 0, driver));
        command.QueueCommand(new OperateToCommand(50, -50, driver));
        command.QueueCommand(new OperateToCommand(100, 0, driver));
        command.QueueCommand(new OperateToCommand(0, 0, driver));
        return command;
    }

    public static ComplexCommand DrawTrapezeCommand(Job2dDriver driver)
    {
        ComplexCommand command = new ComplexCommand();
        command.QueueCommand(new SetPositionCommand(0, 0, driver));
        command.QueueCommand(new OperateToCommand(100, 0, driver));
        command.QueueCommand(new OperateToCommand(130, 100, driver));
        command.QueueCommand(new OperateToCommand(-30, 100, driver));
        command.QueueCommand(new OperateToCommand(0, 0, driver));
        return command;
    }
}
