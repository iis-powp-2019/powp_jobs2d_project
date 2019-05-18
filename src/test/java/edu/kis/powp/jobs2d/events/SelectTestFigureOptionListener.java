package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	@FunctionalInterface
	public interface FigureScript {
		void draw(Job2dDriver driverManager);
	}
	private FigureScript figure;

	public SelectTestFigureOptionListener(DriverManager driverManager, FigureScript figure) {
		this.driverManager = driverManager;
		this.figure = figure;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		figure.draw(driverManager.getCurrentDriver());
	}
}
