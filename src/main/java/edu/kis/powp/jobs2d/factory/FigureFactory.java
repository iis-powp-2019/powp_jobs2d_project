package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.DriverFeature;

import java.util.ArrayList;
import java.util.List;

public class FigureFactory {

    public static DriverCommand getSquare(DriverManager driverManager) {
        List<DriverCommand> driverCommands = new ArrayList<>();
        driverCommands.add(new SetPositionCommand(-60,-60, driverManager.getCurrentDriver()));
        driverCommands.add(new OperateToCommand(60,-60, driverManager.getCurrentDriver()));
        driverCommands.add(new OperateToCommand(60,60, driverManager.getCurrentDriver()));
        driverCommands.add(new OperateToCommand(-60,60, driverManager.getCurrentDriver()));
        driverCommands.add(new OperateToCommand(-60,-60, driverManager.getCurrentDriver()));

        return new ComplexCommand(driverCommands);
    }

    public static DriverCommand getRectangle(DriverManager driverManager) {
        List<DriverCommand> driverCommands = new ArrayList<>();
        driverCommands.add(new SetPositionCommand(-120,-60, driverManager.getCurrentDriver()));
        driverCommands.add(new OperateToCommand(120,-60, driverManager.getCurrentDriver()));
        driverCommands.add(new OperateToCommand(120,60, driverManager.getCurrentDriver()));
        driverCommands.add(new OperateToCommand(-120,60, driverManager.getCurrentDriver()));
        driverCommands.add(new OperateToCommand(-120,-60, driverManager.getCurrentDriver()));

        return new ComplexCommand(driverCommands);
    }

    public static DriverCommand getTriangle(DriverManager driverManager) {
        List<DriverCommand> driverCommands = new ArrayList<>();
        driverCommands.add(new SetPositionCommand(-60,-60, driverManager.getCurrentDriver()));
        driverCommands.add(new OperateToCommand(60,-60, driverManager.getCurrentDriver()));
        driverCommands.add(new OperateToCommand(60,60, driverManager.getCurrentDriver()));
        driverCommands.add(new OperateToCommand(-60,-60, driverManager.getCurrentDriver()));

        return new ComplexCommand(driverCommands);
    }
}
