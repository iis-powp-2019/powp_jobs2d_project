package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.factories.RectangleFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectRectangleOptionListener implements ActionListener  {
	private DriverManager driverManager;
	
    public SelectRectangleOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        RectangleFactory.figureScript(driverManager.getCurrentDriver()).execute();
    }

}
