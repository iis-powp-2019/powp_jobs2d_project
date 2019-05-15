package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.FiguresFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectRectangleFigureOptionListener implements ActionListener {

    DriverManager driverManager;

    public SelectRectangleFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresFactory.rectangleFigure(driverManager.getCurrentDriver());
    }
}
