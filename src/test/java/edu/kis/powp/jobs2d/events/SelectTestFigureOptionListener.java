package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.util.function.Consumer;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private Consumer<Job2dDriver> consumer;

	public SelectTestFigureOptionListener(DriverManager driverManager, Consumer<Job2dDriver> consumer) {
		this.driverManager = driverManager;
		this.consumer = consumer;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		consumer.accept(driverManager.getCurrentDriver());
	}
}
