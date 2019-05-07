package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.DriverCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class TriangleFactory
{
    public static ComplexCommand createTriangle(DriverManager driverManager, int len) {
        ComplexCommand complexCommand = new ComplexCommand();
        int height = (int) (len*Math.sqrt(3)/2);

        DriverCommand driverCommand = new SetPositionCommand(-len, height, driverManager.getCurrentDriver());
        DriverCommand driverCommand2 = new OperateToCommand(len, height, driverManager.getCurrentDriver());
        DriverCommand driverCommand3 = new OperateToCommand(0, -height, driverManager.getCurrentDriver());
        DriverCommand driverCommand4 = new OperateToCommand(-len,height, driverManager.getCurrentDriver());

        complexCommand.addCommand(driverCommand);
        complexCommand.addCommand(driverCommand2);
        complexCommand.addCommand(driverCommand3);
        complexCommand.addCommand(driverCommand4);

        return complexCommand;
    }
}
