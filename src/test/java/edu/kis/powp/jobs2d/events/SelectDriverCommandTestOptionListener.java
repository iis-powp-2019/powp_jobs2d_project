package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
public class SelectDriverCommandTestOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectDriverCommandTestOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand complex = new ComplexCommand();

        DriverCommand driverCommand = new OperateToCommand(driverManager.getCurrentDriver(), 0, 50);
        complex.addCommand(driverCommand);
        DriverCommand driverCommand2 = new OperateToCommand(driverManager.getCurrentDriver(), 50, 50);
        complex.addCommand(driverCommand2);
        DriverCommand driverCommand4 = new OperateToCommand(driverManager.getCurrentDriver(), 50, 0);
        complex.addCommand(driverCommand4);
        DriverCommand driverCommand5 = new OperateToCommand(driverManager.getCurrentDriver(), 0, 0);
        complex.addCommand(driverCommand5);

        complex.execute();
    }
}