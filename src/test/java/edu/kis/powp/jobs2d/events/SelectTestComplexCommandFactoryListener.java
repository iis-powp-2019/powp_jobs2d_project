package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.DriverCommand;

public class SelectTestComplexCommandFactoryListener implements ActionListener {

	private DriverCommand drivercommand;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		drivercommand.execute();
	}
	
	public SelectTestComplexCommandFactoryListener(DriverCommand drivercommand) {
		this.drivercommand=drivercommand;
	}
}
