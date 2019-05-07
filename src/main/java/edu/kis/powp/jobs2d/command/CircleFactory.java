package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class CircleFactory {

    public static ComplexCommand createRectangle(DriverManager driverManager) {
        ComplexCommand complexCommand = new ComplexCommand();
        int r = 20;
        int x, y;

        DriverCommand driverCommand1 = new SetPositionCommand(driverManager.getCurrentDriver(), r, 0);
        complexCommand.addCommand(driverCommand1);

        for (int i = 0; i < 360; i++) {
            x = (int) (r * Math.cos(i));
            y = (int) (r * Math.sin(i));
            DriverCommand driverCommand2 = new OperateToCommand(driverManager.getCurrentDriver(), x, y);
            complexCommand.addCommand(driverCommand2);
        }
        return complexCommand;
    }
}
