package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class FigureFactory {
    public static DriverCommand triangleFactory(DriverManager driverManager){
        List<DriverCommand> commandList = new ArrayList<>();

        commandList.add(new SetPositionCommand(0,0,driverManager.getCurrentDriver()));
        commandList.add(new OperateToCommand(-20,0,driverManager.getCurrentDriver()));
        commandList.add(new OperateToCommand(20,0,driverManager.getCurrentDriver()));
        commandList.add(new OperateToCommand(0,100,driverManager.getCurrentDriver()));
        commandList.add(new OperateToCommand(0,0,driverManager.getCurrentDriver()));
        return new ComplexCommand((ArrayList<DriverCommand>) commandList);
    }

    public static DriverCommand rectangleFactory(DriverManager driverManager){
        List<DriverCommand> commandList = new ArrayList<>();

        commandList.add(new SetPositionCommand(0,0,driverManager.getCurrentDriver()));
        commandList.add(new OperateToCommand(100,0,driverManager.getCurrentDriver()));
        commandList.add(new OperateToCommand(100,60,driverManager.getCurrentDriver()));
        commandList.add(new OperateToCommand(0,60,driverManager.getCurrentDriver()));
        commandList.add(new OperateToCommand(0,0,driverManager.getCurrentDriver()));
        return new ComplexCommand((ArrayList<DriverCommand>) commandList);
    }

}
