package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.FigureFactory;
import edu.kis.powp.jobs2d.drivers.adapter.AbstractDriverAdapter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestRectangleOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestRectangleOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(driverManager.getCurrentDriver() instanceof AbstractDriverAdapter)
            FigureFactory.rectangleFactory(driverManager).execute();
    }

}
