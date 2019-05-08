package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.SinusFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectSinusFactoryOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectSinusFactoryOptionListener(DriverManager driverManager)
    {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ComplexCommand complex = SinusFactory.getSinus(driverManager);
        complex.execute();
    }
}