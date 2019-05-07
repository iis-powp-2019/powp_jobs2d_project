package edu.kis.powp.jobs2d.events;

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
        DriverCommand driverCommand = new SetPositionCommand(-100, -100, driverManager.getCurrentDriver());
        DriverCommand driverCommand2 = new OperateToCommand(-100, 100, driverManager.getCurrentDriver());
        DriverCommand driverCommand3 = new OperateToCommand(100, 100, driverManager.getCurrentDriver());
        DriverCommand driverCommand4 = new OperateToCommand(100, -100, driverManager.getCurrentDriver());
        DriverCommand driverCommand5 = new OperateToCommand(-100, -100, driverManager.getCurrentDriver());

        driverCommand.execute();
        driverCommand2.execute();
        driverCommand3.execute();
        driverCommand4.execute();
        driverCommand5.execute();
    }
}
