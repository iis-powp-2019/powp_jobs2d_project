package edu.kis.powp.command;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class CyrcleFactory {

    public static ComplexCommand createCyrcle(DriverManager driverManager) {
        ComplexCommand complex = new ComplexCommand();
        int radius = 50;

        DriverCommand driverCommand0 = new SetPositionCommand(driverManager.getCurrentDriver(), radius, 0);
        complex.addCommand(driverCommand0);

        for (double i = 0; i < 360; i++) {
            int x = (int) (radius * Math.cos(i));
            int y = (int) (radius * Math.sin(i));
            DriverCommand driverCommand = new OperateToCommand(driverManager.getCurrentDriver(), x, y);
            complex.addCommand(driverCommand);
        }

        return complex;
    }
}
