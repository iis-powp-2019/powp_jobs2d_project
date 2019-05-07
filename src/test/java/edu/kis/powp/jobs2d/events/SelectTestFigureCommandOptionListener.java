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
        ComplexCommand complexCommand = new ComplexCommand();
        Random random = new Random();
        complexCommand.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(), 0, 0));

        for (int i = 1; i < 10; i++) {
            complexCommand.addCommand( new OperateToCommand(driverManager.getCurrentDriver(),(random.nextInt(400))-200 , (random.nextInt(400))-200));
        }
        complexCommand.execute();
    }

}