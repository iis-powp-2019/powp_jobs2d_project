package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class FigureFactory {
    public static DriverCommand triangleFactory(DriverManager driverManager){
        List<DriverCommand> commandList = new ArrayList<>();

        commandList.add(new SetPositionCommand(driverManager.getCurrentDriver(),0,0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),-40,0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),40,0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),0,150));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),-40,0));

        return new ComplexCommand(commandList);
    }

    public static DriverCommand rectangleFactory(DriverManager driverManager) {
        List<DriverCommand> commandList = new ArrayList<>();

        commandList.add(new SetPositionCommand(driverManager.getCurrentDriver(),0,0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),100,0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),100,50));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),0,50));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),0,0));

        return new ComplexCommand(commandList);
    }

    public static DriverCommand trapeziumFactory(DriverManager driverManager){
        List<DriverCommand> commandList = new ArrayList<>();

        commandList.add(new SetPositionCommand(driverManager.getCurrentDriver(),0,0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),200,0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),140,80));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),60,80));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),0,0));

        return new ComplexCommand(commandList);
    }
}


