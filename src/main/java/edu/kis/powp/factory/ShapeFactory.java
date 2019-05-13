package edu.kis.powp.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShapeFactory {

    public static DriverCommand getShape(DriverManager driverManager, String shape) {

        List<DriverCommand> commandList = new ArrayList<>();

        switch (shape) {
            case "rectangle":
                commandList.add(new SetPositionCommand(driverManager.getCurrentDriver(),0, 0));
                commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),150, 0));
                commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),150, 100));
                commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),0, 100));
                commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),0, 0));

                return new ComplexCommand(commandList);
            case "square":
                commandList.add(new SetPositionCommand(driverManager.getCurrentDriver(),0, 0));
                commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),150, 0));
                commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),150, 150));
                commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),0, 150));
                commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),0, 0));

                return new ComplexCommand(commandList);
            default:
                return new ComplexCommand(Collections.emptyList());
        }
    }
}

