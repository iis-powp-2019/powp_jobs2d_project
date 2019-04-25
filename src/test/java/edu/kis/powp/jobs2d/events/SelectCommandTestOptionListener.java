package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DrawerAdapter;

public class SelectCommandTestOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectCommandTestOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DriverCommand driverCommand = new OperateToCommand(new DrawerAdapter(), 3, 20);
        driverCommand.execute();
        DriverCommand driverCommand2 = new SetPositionCommand(new DrawerAdapter(), 3, 20);
        driverCommand2.execute();
        DriverCommand driverCommand3 = new OperateToCommand(new DrawerAdapter(), 10, 5);
        driverCommand3.execute();
    }
}
