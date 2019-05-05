package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureJane implements ActionListener {
    private DriverManager driverManager;

    public SelectTestFigureJane(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override public void actionPerformed(ActionEvent e) {

    }
}
