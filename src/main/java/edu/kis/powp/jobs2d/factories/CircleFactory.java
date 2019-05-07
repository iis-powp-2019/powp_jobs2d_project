package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.DriverCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class CircleFactory
{
    public static ComplexCommand createCircle(DriverManager driverManager, int radius) {
        ComplexCommand complexCommand = new ComplexCommand();

        DriverCommand setPositionCommand = new SetPositionCommand(0, radius, driverManager.getCurrentDriver());
        complexCommand.addCommand(setPositionCommand);

        for (short i = 0; i < 360; i++) {
            int x = (int) (radius * Math.sin(i));
            int y = (int) (radius * Math.cos(i));
            DriverCommand operateToCommand = new OperateToCommand(x, y, driverManager.getCurrentDriver());
            complexCommand.addCommand(operateToCommand);
        }

        return complexCommand;
    }
}
