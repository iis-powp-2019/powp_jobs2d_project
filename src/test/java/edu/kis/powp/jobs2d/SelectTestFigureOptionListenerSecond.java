package edu.kis.powp.jobs2d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListenerSecond implements ActionListener {

	DriverManager driverManager;
	
	@Override
	public void actionPerformed(ActionEvent e) {	
		
		FiguresJoe.figureScript2(driverManager.getCurrentDriver());
	}

	public SelectTestFigureOptionListenerSecond(DriverManager driverManager) {
		super();
		this.driverManager = driverManager;
	}

}