package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class FigureFactory {

    public static DriverCommand getCircleFigure(int radius, DriverManager driverManager){
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(),
                Double.valueOf(Math.sin(Math.toRadians(0))).intValue() * radius,
                Double.valueOf(Math.cos(Math.toRadians(0))).intValue() * radius));

        for (double i  = 0.1; i < 360; i +=0.1){
            Double x  = Math.sin(Math.toRadians(i)) * radius;
            Double y = Math.cos(Math.toRadians(i)) * radius;
            complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(),
                    x.intValue(),
                    y.intValue()
            ));
        }

        return complexCommand;
    }

    public static DriverCommand getRectangleFactory(DriverManager driverManager){
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(), 0,0));

        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 200,0));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 200, 50));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, 50));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, 0));

        return complexCommand;
    }
}
