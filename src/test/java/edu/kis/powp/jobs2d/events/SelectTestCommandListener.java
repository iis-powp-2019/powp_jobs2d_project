package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.ComplexCommand;
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
        ComplexCommand command = new ComplexCommand();
        command.QueueCommand( new SetPositionCommand(0, 0, driverManager.getCurrentDriver()));
        command.QueueCommand(new OperateToCommand(100, 100, driverManager.getCurrentDriver()));
        command.QueueCommand(new OperateToCommand(120, 120, driverManager.getCurrentDriver()));
        command.execute();
    }
}
