package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DriverAdapter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectCommandOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectCommandOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override public void actionPerformed(ActionEvent e) {

        DriverCommand driverCommand1 = new SetPositionCommand(new DriverAdapter(), 100, 200);
        driverCommand1.execute();
        DriverCommand driverCommand = new OperateToCommand(new DriverAdapter(), 100, 200);
        driverCommand.execute();
        DriverCommand driverCommand2 = new OperateToCommand(new DriverAdapter(), 200, 200);
        driverCommand2.execute();
        DriverCommand driverCommand3 = new OperateToCommand(new DriverAdapter(), 200, 100);
        driverCommand3.execute();
        DriverCommand driverCommand4 = new OperateToCommand(new DriverAdapter(), 100, 100);
        driverCommand4.execute();
    }
}
