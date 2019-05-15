package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class FiguresFactory {

    public static void rectangleFigure(Job2dDriver currentDriver) {
        List<DriverCommand> list = new ArrayList<>();
        list.add(new SetPositionCommand(currentDriver, 0, 0));
        list.add(new OperateToCommand(currentDriver,0,100));
        list.add(new OperateToCommand(currentDriver,200,100));
        list.add(new OperateToCommand(currentDriver,200,0));
        list.add(new OperateToCommand(currentDriver,0,0));

        ComplexCommand rectangle = new ComplexCommand(list);
        rectangle.execute();
    }

    public static void diamondFigure(Job2dDriver currentDriver) {
        List<DriverCommand> list = new ArrayList<>();
        list.add(new SetPositionCommand(currentDriver,0,0));
        list.add(new OperateToCommand(currentDriver,60,-100));
        list.add(new OperateToCommand(currentDriver,0,-200));
        list.add(new OperateToCommand(currentDriver,-60,-100));
        list.add(new OperateToCommand(currentDriver,0,0));

        ComplexCommand diamond = new ComplexCommand(list);
        diamond.execute();
    }
}
