package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.events.magicpresets.SimpleFigure;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTriangleFigureOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTriangleFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SimpleFigure.figureTriangle(driverManager.getCurrentDriver());
    }
}
