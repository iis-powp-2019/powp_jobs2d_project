package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DrawerAdapter;

public class DriverCommandTestOptionListener implements ActionListener {

    private DriverManager driverManager;

    public DriverCommandTestOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand complex = new ComplexCommand();

        DriverCommand driverCommand = new OperateToCommand(driverManager.getCurrentDriver(), 0, 50);
        complex.addToDriverCommandList(driverCommand);
        DriverCommand driverCommand2 = new OperateToCommand(driverManager.getCurrentDriver(), 50, 50);
        complex.addToDriverCommandList(driverCommand2);
        DriverCommand driverCommand4 = new OperateToCommand(driverManager.getCurrentDriver(), 50, 0);
        complex.addToDriverCommandList(driverCommand4);
        DriverCommand driverCommand5 = new OperateToCommand(driverManager.getCurrentDriver(), 0, 0);
        complex.addToDriverCommandList(driverCommand5);

        complex.execute();
    }
}
