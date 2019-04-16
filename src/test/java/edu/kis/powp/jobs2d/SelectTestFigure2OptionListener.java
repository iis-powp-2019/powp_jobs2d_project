package edu.kis.powp.jobs2d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigure2OptionListener implements ActionListener {

	private DriverManager driverManager;
	
	public SelectTestFigure2OptionListener(DriverManager driverManager) {
		super();
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		FiguresJoe.figureScript2(driverManager.getCurrentDriver());
	}
}
