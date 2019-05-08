package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.TrianglePattern;

public class SelectTestTrianglePatternOptionListener implements ActionListener {
	
	private DriverManager driverManager;

	public SelectTestTrianglePatternOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		ComplexCommand complex = TrianglePattern.createTriangle(driverManager);
        complex.execute();
	}

	
}
