package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private String namePattern;

	public SelectTestFigureOptionListener(DriverManager driverManager, String namePattern) {
		this.driverManager = driverManager;
		this.namePattern = namePattern;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(namePattern.equals("Figures Joe 1")) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}
		else if(namePattern.equals("Figures Joe 2")) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
	}
}
