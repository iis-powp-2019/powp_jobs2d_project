package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.FiguresJaneDrawer;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFiguresJaneOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFiguresJaneOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (driverManager.getCurrentDriver() instanceof FiguresJaneDrawer)
			FiguresJane.figureScript((FiguresJaneDrawer) driverManager.getCurrentDriver());
	}

	@Override
	public String toString() {
		return "Figures Jane Simulator";
	}

}