package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.factory.FigureFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestDeltoidOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestDeltoidOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FigureFactory.getDeltoid(driverManager).execute();
    }
}
