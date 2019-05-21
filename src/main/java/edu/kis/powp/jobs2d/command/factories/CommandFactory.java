package edu.kis.powp.jobs2d.command.factories;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {

    public ComplexCommand rectangle(Job2dDriver driver) {

        List<DriverCommand> list = new ArrayList<>();

        list.add(new SetPositionCommand(driver,150,150));
        list.add(new OperateToCommand(driver,-150,150));
        list.add(new OperateToCommand(driver,-150,0));
        list.add(new OperateToCommand(driver,150,0));
        list.add(new OperateToCommand(driver,150,150));
        ComplexCommand complexCommand = new ComplexCommand(list);
        return complexCommand;
    }

    public ComplexCommand triangle(Job2dDriver driver) {

        List<DriverCommand> list2 = new ArrayList<>();

        list2.add(new SetPositionCommand(driver, 150, 150));
        list2.add(new OperateToCommand(driver, 150, 150));
        list2.add(new OperateToCommand(driver, 0, 0));
        list2.add(new OperateToCommand(driver, -150, 150));
        list2.add(new OperateToCommand(driver, 150, 150));
        ComplexCommand complexCommand = new ComplexCommand(list2);
        return complexCommand;
    }

}
