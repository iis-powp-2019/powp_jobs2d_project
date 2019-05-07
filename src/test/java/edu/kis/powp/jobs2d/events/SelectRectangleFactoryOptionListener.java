package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.factories.RectangleFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectRectangleFactoryOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectRectangleFactoryOptionListener(DriverManager driverManager)
    {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ComplexCommand complex = RectangleFactory.createRectangle(driverManager, 100, 50);
        complex.execute();
    }
}

