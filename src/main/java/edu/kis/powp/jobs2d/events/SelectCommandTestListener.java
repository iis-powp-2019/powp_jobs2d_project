package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverCommand.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverCommand.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.DriverCommand.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectCommandTestListener implements ActionListener {
    private DriverManager driverManager;

    public SelectCommandTestListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DriverCommand firstDriverCommand = new SetPositionCommand(driverManager.getCurrentDriver(),0,0);
        DriverCommand secondDriverCommand = new OperateToCommand(driverManager.getCurrentDriver(),100,0);
        DriverCommand thirdDriverCommand = new OperateToCommand(driverManager.getCurrentDriver(),100,100);
        DriverCommand fourthDriverCommand = new OperateToCommand(driverManager.getCurrentDriver(),0,100);
        DriverCommand fifthDriverCommand = new OperateToCommand(driverManager.getCurrentDriver(),0,0);
        firstDriverCommand.execute();
        secondDriverCommand.execute();
        thirdDriverCommand.execute();
        fourthDriverCommand.execute();
        fifthDriverCommand.execute();
    }
}
