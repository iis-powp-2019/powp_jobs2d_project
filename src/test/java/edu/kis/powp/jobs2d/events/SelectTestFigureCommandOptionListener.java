package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.*;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.*;
import java.util.Random;

public class SelectTestFigureCommandOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTestFigureCommandOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random random = new Random();
        DriverCommand[] driverCommand = new DriverCommand[10];
        driverCommand[0] = new SetPositionCommand(driverManager.getCurrentDriver(), 0, 0);

        for (int i = 1; i < 10; i++) {
            driverCommand[i] = new OperateToCommand(driverManager.getCurrentDriver(),(random.nextInt(400))-200 , (random.nextInt(400))-200);
        }

        for (int i = 0; i < 10; i++) {
            driverCommand[i].execute();
        }
    }
}