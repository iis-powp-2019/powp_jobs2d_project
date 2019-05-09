package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.CommandLog;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommandTest implements ActionListener {
    private DriverManager driverManager;

    public CommandTest(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CommandLog logger = CommandLog.getInstance();
        logger.setDriver(driverManager.getCurrentDriver());
        FiguresJoe.figureScript1(logger);
        logger.getComplexCommand().execute();
    }

}
