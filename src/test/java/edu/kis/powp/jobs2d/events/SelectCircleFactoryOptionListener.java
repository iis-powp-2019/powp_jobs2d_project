package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.factories.CircleFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectCircleFactoryOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectCircleFactoryOptionListener(DriverManager driverManager)
    {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ComplexCommand complex = CircleFactory.createCircle(driverManager, 150);
        complex.execute();
    }
}
