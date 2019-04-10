package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private final int selected;

	public SelectTestFigureOptionListener(DriverManager driverManager,int selected) {
		this.driverManager = driverManager;
		this.selected =selected;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		if (selected == 1)
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		else {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
	}
}
