package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectSecondTestFigureOptionListener implements ActionListener {
	
	private DriverManager driverManager;
	
	public SelectSecondTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		FiguresJoe.figureScript2(driverManager.getCurrentDriver());
	}
}
