package edu.kis.powp.jobs2d.command;

public class CommandFactory {
    public static ComplexCommand getRectangle(){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommandToList(new SetPositionCommand(0, 0));
        complexCommand.addCommandToList(new OperateToCommand(100, 0));
        complexCommand.addCommandToList(new OperateToCommand(100, 100));
        complexCommand.addCommandToList(new OperateToCommand(0, 100));
        complexCommand.addCommandToList(new OperateToCommand(0, 0));
        return complexCommand;
    }

    public static ComplexCommand getTriangle(){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommandToList(new SetPositionCommand(0, 0));
        complexCommand.addCommandToList(new OperateToCommand(100, 100));
        complexCommand.addCommandToList(new OperateToCommand(0, 100));
        complexCommand.addCommandToList(new OperateToCommand(0, 0));
        return complexCommand;
    }
}
