package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class FigureFactory {

    public static DriverCommand getSquare(DriverManager driverManager) {
        ComplexCommand complex = new ComplexCommand();
        complex.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(), 0, 0));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 45, -45));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, -90));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), -45, -45));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, 0));
        return complex;
    }

    public static DriverCommand getTriangle(DriverManager driverManager) {
        ComplexCommand complex = new ComplexCommand();
        complex.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(), 0, 0));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 45, -45));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), -45, -45));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, 0));
        return complex;
    }

    public static DriverCommand getHexagon(DriverManager driverManager) {
        ComplexCommand complex = new ComplexCommand();
        complex.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(), 0, 0));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 45, -45));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 45, -90));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, -135));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), -45, -90));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), -45, -45));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, 0));
        return complex;
    }
}
