package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.FigureFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestFigureOptionFromNameListner implements ActionListener{

	
	private DriverManager driverManager;
	int i;
	

	public SelectTestFigureOptionFromNameListner(DriverManager driverManager, int i) {
		this.driverManager = driverManager;
		this.i=i;
	}



	public void actionPerformed(ActionEvent e) {
		if(i==1)
            FigureFactory.triangleFactory(driverManager.getCurrentDriver()).execute();
            else
            FigureFactory.rectangleFactory(driverManager.getCurrentDriver()).execute();
		
	}

}
