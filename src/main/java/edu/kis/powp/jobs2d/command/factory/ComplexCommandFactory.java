package edu.kis.powp.jobs2d.command.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommandFactory {

    public static ComplexCommand getRectangle(Job2dDriver job2dDriver){

        List<DriverCommand> list = new ArrayList<>();
        list.add(new SetPositionCommand(100, 100, job2dDriver));
        list.add(new OperateToCommand(-100, 100, job2dDriver));
        list.add(new OperateToCommand(-100, 0, job2dDriver));
        list.add(new OperateToCommand(100, 0, job2dDriver));
        list.add(new OperateToCommand(100, 100, job2dDriver));

        return new ComplexCommand(list);
    }
}
