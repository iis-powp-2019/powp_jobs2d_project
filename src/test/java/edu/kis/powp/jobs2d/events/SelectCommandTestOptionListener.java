package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.RectangleFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectCommandTestOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectCommandTestOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand complex = RectangleFactory.createRectangle(driverManager);
        complex.execute();
    }
}
