package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.CommandLogger;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectJoeFigureCommand implements ActionListener {
    private DriverManager driverManager;

    public SelectJoeFigureCommand(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CommandLogger logger = CommandLogger.getInstance();
        logger.setDriver(driverManager.getCurrentDriver());
        FiguresJoe.figureScript1(logger);
        logger.getComplexCommand().execute();
    }
}
