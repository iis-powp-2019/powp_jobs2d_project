package edu.kis.powp.jobs2d.drivers.factory;

import edu.kis.powp.jobs2d.Command.ComplexCommand;
import edu.kis.powp.jobs2d.Command.DriverCommand;
import edu.kis.powp.jobs2d.Command.OperateToCommand;
import edu.kis.powp.jobs2d.Command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

    public static DriverCommand getDrawCommand(DriverManager driverManager) {
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(0,0, driverManager.getCurrentDriver()));
        commandList.add(new OperateToCommand(100,0, driverManager.getCurrentDriver()));
        commandList.add(new SetPositionCommand(100,0, driverManager.getCurrentDriver()));
        commandList.add(new OperateToCommand(50,100, driverManager.getCurrentDriver()));
        commandList.add(new OperateToCommand(0,0, driverManager.getCurrentDriver()));

        return new ComplexCommand(driverManager.getCurrentDriver(), commandList);
    }
}
