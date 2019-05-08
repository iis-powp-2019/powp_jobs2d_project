package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.RectanglePattern;

public class SelectTestRectangleFactoryOptionListener implements ActionListener {

	private DriverManager driverManager;

    public SelectTestRectangleFactoryOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }
     @Override
	public void actionPerformed(ActionEvent e) {

        ComplexCommand complex = RectanglePattern.rectangleScript(driverManager);
        complex.execute();
    }
}
