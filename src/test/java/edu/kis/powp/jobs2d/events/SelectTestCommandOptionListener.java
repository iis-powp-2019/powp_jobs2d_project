package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestCommandOptionListener implements ActionListener {

	private DriverManager driverManager;
	private ComplexCommand figure;

	public SelectTestCommandOptionListener(DriverManager driverManager, ComplexCommand figure) {
		this.driverManager = driverManager;
		this.figure = figure;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		figure.execute(driverManager.getCurrentDriver());
	}
}
