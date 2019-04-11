package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.FigureJaneAdapter;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectFigureJaneOptionListener implements ActionListener {

    private AbstractDriver driverManager;

    public SelectFigureJaneOptionListener(AbstractDriver driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresJane.figureScript(driverManager);
    }
}
