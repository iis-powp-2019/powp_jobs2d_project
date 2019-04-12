package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

public class SelectTestFigureJaneOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureJaneOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (driverManager.getCurrentDriver() instanceof AbstractDriver) {
            FiguresJane.figureScript((AbstractDriver) driverManager.getCurrentDriver());
        }
    }
}
