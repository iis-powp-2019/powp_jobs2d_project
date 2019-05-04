package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.CircleFactory;
import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectCircleFactoryTestOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectCircleFactoryTestOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }
     @Override
	public void actionPerformed(ActionEvent e) {
       
        ComplexCommand complex = CircleFactory.createCircle(driverManager);
        complex.execute();
    }
}

