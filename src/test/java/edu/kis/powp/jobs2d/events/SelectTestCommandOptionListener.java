package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestCommandOptionListener implements ActionListener {

	private DriverManager driverManager;
	private DriverCommand cmd;

	public SelectTestCommandOptionListener(DriverManager driverManager, DriverCommand cmd) {
		this.driverManager = driverManager;
		this.cmd = cmd;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		cmd.execute(driverManager.getCurrentDriver());
	}
}
