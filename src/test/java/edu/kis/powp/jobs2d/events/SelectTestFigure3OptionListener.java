package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.AbtractAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

public class SelectTestFigure3OptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigure3OptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(driverManager.getCurrentDriver() instanceof AbtractAdapter)
        FiguresJane.figureScript((AbtractAdapter) driverManager.getCurrentDriver());
    }
}
