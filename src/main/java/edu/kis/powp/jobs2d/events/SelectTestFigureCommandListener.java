package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureCommandListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureCommandListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) { //nie działą
        OperateToCommand operateToCommand = new OperateToCommand(driverManager.getCurrentDriver(), 100, 100);
        SetPositionCommand setPositionCommand = new SetPositionCommand(driverManager.getCurrentDriver(),-100, -100);
    }
}
