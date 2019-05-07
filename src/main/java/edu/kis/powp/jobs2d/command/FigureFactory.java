package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.util.ArrayList;
import java.util.List;

public class FigureFactory {

    public static ComplexCommand getSquare(DriverManager driverManager) {

        List<DriverCommand> listDriverCommands = new ArrayList<>();

        listDriverCommands.add(new SetPositionCommand(0, 0, driverManager.getCurrentDriver()));
        listDriverCommands.add(new OperateToCommand(80, 0, driverManager.getCurrentDriver()));
        listDriverCommands.add(new OperateToCommand(80, 80, driverManager.getCurrentDriver()));
        listDriverCommands.add(new OperateToCommand(0, 80, driverManager.getCurrentDriver()));
        listDriverCommands.add(new OperateToCommand(0, 0, driverManager.getCurrentDriver()));

        ComplexCommand complexCommand = new ComplexCommand(listDriverCommands);
        return complexCommand;
    }

    public static ComplexCommand getRectangle(DriverManager driverManager) {

        List<DriverCommand> listDriverCommands = new ArrayList<>();

        listDriverCommands.add(new SetPositionCommand(0, 0, driverManager.getCurrentDriver()));
        listDriverCommands.add(new OperateToCommand(80, 0, driverManager.getCurrentDriver()));
        listDriverCommands.add(new OperateToCommand(80, 160, driverManager.getCurrentDriver()));
        listDriverCommands.add(new OperateToCommand(0, 160, driverManager.getCurrentDriver()));
        listDriverCommands.add(new OperateToCommand(0, 0, driverManager.getCurrentDriver()));

        ComplexCommand complexCommand = new ComplexCommand(listDriverCommands);
        return complexCommand;
    }

    public static ComplexCommand getTriangle(DriverManager driverManager) {

        List<DriverCommand> listDriverCommands = new ArrayList<>();

        listDriverCommands.add(new SetPositionCommand(0, 0, driverManager.getCurrentDriver()));
        listDriverCommands.add(new OperateToCommand(160, 0, driverManager.getCurrentDriver()));
        listDriverCommands.add(new OperateToCommand(80, 80, driverManager.getCurrentDriver()));
        listDriverCommands.add(new OperateToCommand(0, 0, driverManager.getCurrentDriver()));

        ComplexCommand complexCommand = new ComplexCommand(listDriverCommands);
        return complexCommand;
    }
}
