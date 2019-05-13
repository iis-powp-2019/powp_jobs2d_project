package edu.kis.powp.jobs2d.events.options;

import edu.kis.powp.factory.ShapeFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.AbstractDriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestRectangleOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestRectangleOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ShapeFactory.getShape(driverManager,"rectangle").execute();
    }
}
