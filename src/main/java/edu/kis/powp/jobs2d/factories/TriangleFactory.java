package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class TriangleFactory {

    public static ComplexCommand createCircle(DriverManager driverManager) {
        ComplexCommand complex = new ComplexCommand();
        complex.addCommand(new SetPositionCommand(0, 0, driverManager.getCurrentDriver()));
        complex.addCommand(new OperateToCommand(45, -45, driverManager.getCurrentDriver()));
        complex.addCommand(new OperateToCommand(0, -90, driverManager.getCurrentDriver()));
        complex.addCommand(new OperateToCommand(-45, -45, driverManager.getCurrentDriver()));
        complex.addCommand(new OperateToCommand(0, 0, driverManager.getCurrentDriver()));
        return complex;
    }
}