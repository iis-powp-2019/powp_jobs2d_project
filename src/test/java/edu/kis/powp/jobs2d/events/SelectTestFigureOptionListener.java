package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.factory.FigureFactory;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private final String scriptId;

	public SelectTestFigureOptionListener(DriverManager driverManager, String scriptId) {
		this.driverManager = driverManager;
		this.scriptId = scriptId;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (scriptId.equals("Figure Joe 1")) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}
		else if (scriptId.equals("Figure Joe 2")){
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
		else if (scriptId.equals("Square")) {
			FigureFactory.getSquare(driverManager).execute();
		}
		else if (scriptId.equals("Rectangle")) {
			FigureFactory.getRectangle(driverManager).execute();
		}
		else if (scriptId.equals("Triangle")) {
			FigureFactory.getTriangle(driverManager).execute();
		}

	}
}
