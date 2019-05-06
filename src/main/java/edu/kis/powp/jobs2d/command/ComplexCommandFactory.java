package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommandFactory {

    public ComplexCommand getShape(String shapeType, Job2dDriver driver){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("TRIANGLE")){
            return triangle(driver);
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return square(driver);
        }

        return null;
    }

    private ComplexCommand triangle(Job2dDriver driver){
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(-100,-100, driver));
        commandList.add(new OperateToCommand(100,-100, driver));
        commandList.add(new OperateToCommand(0,100, driver));
        commandList.add(new OperateToCommand(-100,-100, driver));
        return new ComplexCommand(commandList);
    }

    private ComplexCommand square(Job2dDriver driver){
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(-100,-100, driver));
        commandList.add(new OperateToCommand(100,-100, driver));
        commandList.add(new OperateToCommand(100,100, driver));
        commandList.add(new OperateToCommand(-100,100, driver));
        commandList.add(new OperateToCommand(-100,-100, driver));
        return new ComplexCommand(commandList);
    }
}
