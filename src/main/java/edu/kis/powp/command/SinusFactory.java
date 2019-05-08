package edu.kis.powp.command;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SinusFactory {

    public static ComplexCommand getSinus(DriverManager driverManager) {

        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(), -300, 0));

        for (int i = -250; i < 250; i++) {
            int y = (int) (20*Math.cos(i));
            DriverCommand driverCommand = new OperateToCommand(driverManager.getCurrentDriver(), i*10, y);
            complexCommand.addCommand(driverCommand);
        }
        return complexCommand;
    }
}