package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.FigureFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestFigureOptionFromNameListner implements ActionListener{

	
	private DriverManager driverManager;
	

	public SelectTestFigureOptionFromNameListner(DriverManager driverManager) {
		this.driverManager = driverManager;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
            FigureFactory.triangleFactory(driverManager.getCurrentDriver()).execute();
		
	}

}
