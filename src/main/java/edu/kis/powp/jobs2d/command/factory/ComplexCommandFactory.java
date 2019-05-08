package edu.kis.powp.jobs2d.command.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommandFactory {

    public ComplexCommand prostokat(Job2dDriver driver) {

        List<DriverCommand> list = new ArrayList<>();

		list.add(new SetPositionCommand(driver,100,100));
        list.add(new OperateToCommand(driver,-100,100));
        list.add(new OperateToCommand(driver,-100,0));
        list.add(new OperateToCommand(driver,100,0));
        list.add(new OperateToCommand(driver,100,100));
        ComplexCommand complexCommand = new ComplexCommand(list);
        return complexCommand;
    }

}
