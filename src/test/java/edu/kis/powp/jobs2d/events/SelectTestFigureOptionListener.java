package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	int option;

	public SelectTestFigureOptionListener(DriverManager driverManager, int i) {
		this.driverManager = driverManager;
		option=i;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (option==1)
		FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		else if(option==2){
		FiguresJoe.figureScript2(driverManager.getCurrentDriver());}
	}
}
