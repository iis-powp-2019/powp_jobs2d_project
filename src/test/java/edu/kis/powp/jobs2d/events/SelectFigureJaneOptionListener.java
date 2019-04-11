package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.FigureJaneAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectFigureJaneOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectFigureJaneOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(driverManager.getCurrentDriver() instanceof FigureJaneAdapter)
            FiguresJane.figureScript((AbstractDriver) driverManager.getCurrentDriver());
    }
}
