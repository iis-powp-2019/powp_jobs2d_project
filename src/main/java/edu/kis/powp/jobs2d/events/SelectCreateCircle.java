package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.ShapeFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectCreateCircle implements ActionListener {

    private DriverManager driverManager;

    public SelectCreateCircle(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ShapeFactory factory = new ShapeFactory(driverManager.getCurrentDriver());
        ComplexCommand complexCommand = (ComplexCommand) factory.createCircle(0, 0, 123);
        complexCommand.execute();
    }
}