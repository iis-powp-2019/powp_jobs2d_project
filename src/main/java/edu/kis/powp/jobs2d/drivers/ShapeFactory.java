package edu.kis.powp.jobs2d.drivers;


import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;


public class ShapeFactory {

    public static ComplexCommand drawTriangle()
    {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(0, 0));
        complexCommand.addCommand(new OperateToCommand(50, -50));
        complexCommand.addCommand(new OperateToCommand(100, 0));
        complexCommand.addCommand(new OperateToCommand(0, 0));
        return complexCommand;
    }

    public static ComplexCommand drawSquare() {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(0, 0));
        complexCommand.addCommand(new OperateToCommand(100, 0));
        complexCommand.addCommand(new OperateToCommand(100, 100));
        complexCommand.addCommand(new OperateToCommand(0, 100));
        complexCommand.addCommand(new OperateToCommand(0, 0));
        return complexCommand;
    }


}
