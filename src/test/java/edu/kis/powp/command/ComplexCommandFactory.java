package edu.kis.powp.command;

public class ComplexCommandFactory {

    public static ComplexCommand createShape(String shape){
        switch (shape)
        {
            case "square":
                return drawSquare();

            case "rectangle":
                return drawRectangle();

        }
        return null;
    }

    public static ComplexCommand drawSquare() {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(0, 0));
        complexCommand.addCommand(new OperateToCommand(0, 100));
        complexCommand.addCommand(new OperateToCommand(100, 100));
        complexCommand.addCommand(new OperateToCommand(100, 0));
        complexCommand.addCommand(new OperateToCommand(0, 0));
        return complexCommand;
    }

    public static ComplexCommand drawRectangle()
    {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(0, 0));
        complexCommand.addCommand(new OperateToCommand(100, 0));
        complexCommand.addCommand(new OperateToCommand(100, 60));
        complexCommand.addCommand(new OperateToCommand(0, 60));
        complexCommand.addCommand(new OperateToCommand(0, 0));
        return complexCommand;
    }





}
