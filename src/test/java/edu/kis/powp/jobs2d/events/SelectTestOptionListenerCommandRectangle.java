package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.factory.CommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestOptionListenerCommandRectangle implements ActionListener {

	private DriverManager driverManager;

	public SelectTestOptionListenerCommandRectangle(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		ComplexCommand complexCommand = CommandFactory.drawRectangle(driverManager.getCurrentDriver());
		complexCommand.execute();
	
	}
	
}
