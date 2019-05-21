package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FigureFactory {

    public static DriverCommand getFigure(DriverManager driverManager, String figureType) {

        List<DriverCommand> commandList = new ArrayList<>();

        if (figureType == "Rectangle") {
            commandList.add(new SetPositionCommand(driverManager.getCurrentDriver(), 0, 0));
            commandList.add(new OperateToCommand(driverManager.getCurrentDriver(), 150, 0));
            commandList.add(new OperateToCommand(driverManager.getCurrentDriver(), 150, 100));
            commandList.add(new OperateToCommand(driverManager.getCurrentDriver(), 0, 100));
            commandList.add(new OperateToCommand(driverManager.getCurrentDriver(), 0, 0));
            return new ComplexCommand(commandList);
        } else if (figureType == "Triangle") {
            commandList.add(new SetPositionCommand(driverManager.getCurrentDriver(), 0, 0));
            commandList.add(new OperateToCommand(driverManager.getCurrentDriver(), -75, 0));
            commandList.add(new OperateToCommand(driverManager.getCurrentDriver(), -75, -150));
            commandList.add(new OperateToCommand(driverManager.getCurrentDriver(), 0, 0));

            return new ComplexCommand(commandList);
        } else return new ComplexCommand(Collections.emptyList());
    }
}
