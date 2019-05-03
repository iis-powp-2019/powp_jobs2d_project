package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class FigureFactory {

    public static DriverCommand rectangleFactory(DriverManager driverManager){
        List<DriverCommand> commandList = new ArrayList<>();

        commandList.add(new SetPositionCommand(driverManager.getCurrentDriver(),0,0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),200,0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),200,120));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),0,120));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),0,0));

        return new ComplexCommand(commandList);
    }


}
