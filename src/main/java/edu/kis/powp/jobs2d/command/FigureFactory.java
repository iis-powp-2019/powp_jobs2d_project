package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class FigureFactory {

    public static DriverCommand getSquare(DriverManager driverManager) {
        ComplexCommand complex = new ComplexCommand();
        complex.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(), 1, 0));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 1, 50));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 50, 0));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 5, 50));

        return complex;
    }

    public static DriverCommand getCircle(DriverManager driverManager) {
        ComplexCommand complex = new ComplexCommand();
        complex.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(), -10, 10));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 10, 10));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 10, 10));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 10, -10));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), -10, 10));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), -10, -10));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 10, -10));
        return complex;
    }
}
