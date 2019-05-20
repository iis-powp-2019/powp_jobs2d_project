package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.factory.ShapeFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestTriangleOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestTriangleOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ShapeFactory.getShape(driverManager,"square").execute();
    }
}
