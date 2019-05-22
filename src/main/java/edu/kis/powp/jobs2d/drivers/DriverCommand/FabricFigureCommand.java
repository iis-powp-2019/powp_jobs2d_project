package edu.kis.powp.jobs2d.drivers.DriverCommand;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class FabricFigureCommand {
    public static DriverCommand squareDrawingCommand(DriverManager driverManager){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(),0,0));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(),100,0));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(),100,100));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(),0,100));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(),0,0));
        return complexCommand;
    }
    public static DriverCommand rectangleDrawingCommand(DriverManager driverManager){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(),0,0));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(),200,0));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(),200,100));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(),0,100));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(),0,0));
        return complexCommand;
    }
    public static DriverCommand triangleDrawingCommand(DriverManager driverManager){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(),0,0));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(),100,0));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(),100,100));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(),0,0));
        return complexCommand;
    }
}
