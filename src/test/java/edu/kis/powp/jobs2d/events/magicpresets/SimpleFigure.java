package edu.kis.powp.jobs2d.events.magicpresets;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;

public class SimpleFigure {

    public static void figureTriangle(Job2dDriver driver) {
        ComplexCommand rectangleDrawer = new ComplexCommand(new ArrayList<>());
        rectangleDrawer.addCommand(new SetPositionCommand(0, 0, driver));
        rectangleDrawer.addCommand(new OperateToCommand(250, 0, driver));
        rectangleDrawer.addCommand(new OperateToCommand(125, 125, driver));
        rectangleDrawer.addCommand(new OperateToCommand(0, 0, driver));

        rectangleDrawer.execute();
    }

    public static void figureSquare(Job2dDriver driver) {
        ComplexCommand rectangleDrawer = new ComplexCommand(new ArrayList<>());
        rectangleDrawer.addCommand(new SetPositionCommand(-124, 0, driver));
        rectangleDrawer.addCommand(new OperateToCommand(125, 0, driver));
        rectangleDrawer.addCommand(new OperateToCommand(125, 125, driver));
        rectangleDrawer.addCommand(new OperateToCommand(-125, 125, driver));
        rectangleDrawer.addCommand(new OperateToCommand(-125, 0, driver));

        rectangleDrawer.execute();
    }
}
