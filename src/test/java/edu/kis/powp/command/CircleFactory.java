package edu.kis.powp.command;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class CircleFactory {

    public static ComplexCommand drawCircle(DriverManager driverManager) {
        ComplexCommand complex = new ComplexCommand();
        int radius = 100;

        DriverCommand driverCommand = new SetPositionCommand(driverManager.getCurrentDriver(), radius, 0);
        complex.addCommand(driverCommand);

        for (double i = 0; i < 360; i++) {
            int x = (int) (radius * Math.cos(i));
            int y = (int) (radius * Math.sin(i));
            DriverCommand driverCommand2 = new OperateToCommand(driverManager.getCurrentDriver(), x, y);
            complex.addCommand(driverCommand2);
        }

        return complex;
    }
}