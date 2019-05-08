package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestCommandListener implements ActionListener
{
    private DriverManager driverManager;

    public SelectTestCommandListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DriverCommand comm1 = new SetPositionCommand(0, 0, driverManager.getCurrentDriver());
        DriverCommand comm2 = new OperateToCommand(100, 100, driverManager.getCurrentDriver());
        DriverCommand comm3 = new OperateToCommand(120, 120, driverManager.getCurrentDriver());
        comm1.execute();
        comm2.execute();
        comm3.execute();
    }
}
