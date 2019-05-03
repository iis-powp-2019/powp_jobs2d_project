package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectSquareOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectSquareOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new ComplexCommandFactory(driverManager.getCurrentDriver()).createFigure("sqr").execute();
    }
}
