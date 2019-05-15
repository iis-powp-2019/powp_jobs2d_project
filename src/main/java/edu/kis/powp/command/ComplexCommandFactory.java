package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommandFactory {
    public ComplexCommand draw1(Job2dDriver driver){
        List<DriverCommand> list = new ArrayList<>();
        list.add(new SetPositionCommand(-100,-100, driver));
        list.add(new OperateToCommand(-100,100, driver));
        list.add(new OperateToCommand(0,100, driver));
        list.add(new OperateToCommand(-100,-100, driver));
        return new ComplexCommand(list);
    }
    public ComplexCommand draw2(Job2dDriver driver){
        List<DriverCommand> list = new ArrayList<>();
        list.add(new SetPositionCommand(-100,-100, driver));
        list.add(new OperateToCommand(0,100, driver));
        list.add(new OperateToCommand(0,-100, driver));
        list.add(new OperateToCommand(-100,-100, driver));
        return new ComplexCommand(list);
    }
}
