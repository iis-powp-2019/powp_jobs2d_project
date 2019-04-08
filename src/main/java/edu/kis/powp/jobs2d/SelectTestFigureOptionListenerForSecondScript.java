package edu.kis.powp.jobs2d;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureOptionListenerForSecondScript implements ActionListener {

    DriverManager driverManager;

    public SelectTestFigureOptionListenerForSecondScript(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override public void actionPerformed(ActionEvent e) {
        FiguresJoe.figureScript2(driverManager.getCurrentDriver());
    }
}
