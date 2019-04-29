package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.AbstractDriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureJaneOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTestFigureJaneOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (this.driverManager.getCurrentDriver() instanceof AbstractDriverAdapter) {
            FiguresJane.figureScript((AbstractDriverAdapter) driverManager.getCurrentDriver());
        }
    }
}