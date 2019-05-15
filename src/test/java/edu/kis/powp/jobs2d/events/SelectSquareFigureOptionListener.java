package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.events.magicpresets.SimpleFigure;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectSquareFigureOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectSquareFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SimpleFigure.figureSquare(driverManager.getCurrentDriver());
    }
}
