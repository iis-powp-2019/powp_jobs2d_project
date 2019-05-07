package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.DriverCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectCommandTestOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectCommandTestOptionListener(DriverManager driverManager){
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand complexCommand = new ComplexCommand();

        DriverCommand driverCommand = new SetPositionCommand(-100, -100, driverManager.getCurrentDriver());
        DriverCommand driverCommand2 = new OperateToCommand(-100, 100, driverManager.getCurrentDriver());
        DriverCommand driverCommand3 = new OperateToCommand(100, 100, driverManager.getCurrentDriver());
        DriverCommand driverCommand4 = new OperateToCommand(100, -100, driverManager.getCurrentDriver());
        DriverCommand driverCommand5 = new OperateToCommand(-100, -100, driverManager.getCurrentDriver());

        complexCommand.addCommand(driverCommand);
        complexCommand.addCommand(driverCommand2);
        complexCommand.addCommand(driverCommand3);
        complexCommand.addCommand(driverCommand4);
        complexCommand.addCommand(driverCommand5);

        complexCommand.execute();
    }
}
