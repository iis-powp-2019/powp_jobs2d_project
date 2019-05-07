package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.factories.RectangleFactory;
import edu.kis.powp.jobs2d.factories.TriangleFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTriangleFactoryOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTriangleFactoryOptionListener(DriverManager driverManager)
    {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ComplexCommand complex = TriangleFactory.createTriangle(driverManager, 120);
        complex.execute();
    }
}

