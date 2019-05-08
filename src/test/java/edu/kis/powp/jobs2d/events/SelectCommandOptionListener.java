package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommand;
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

        ComplexCommand complex = new ComplexCommand();

        DriverCommand driverCommand1 = new OperateToCommand(driverManager.getCurrentDriver(), 0, 100);
        DriverCommand driverCommand2 = new OperateToCommand(driverManager.getCurrentDriver(), 100, 100);
        DriverCommand driverCommand3 = new OperateToCommand(driverManager.getCurrentDriver(), 100, 0);
        DriverCommand driverCommand4 = new OperateToCommand(driverManager.getCurrentDriver(), 0, 0);

        complex.addCommand(driverCommand1);
        complex.addCommand(driverCommand2);
        complex.addCommand(driverCommand3);
        complex.addCommand(driverCommand4);

        complex.execute();
    }
}
