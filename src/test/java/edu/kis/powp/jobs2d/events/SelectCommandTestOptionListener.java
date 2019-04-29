package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.Adapter;

public class SelectCommandTestOptionListener implements ActionListener {
	
	private DriverManager driverManager;

	public SelectCommandTestOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DriverCommand driverCommand = new OperateToCommand(new Adapter(), 0, 100);
		driverCommand.execute();
		DriverCommand driverCommand2 = new SetPositionCommand(new Adapter(), 0, 100);
		driverCommand2.execute();
		DriverCommand driverCommand3 = new OperateToCommand(new Adapter(), 100, 50);
		driverCommand3.execute();
	}
}
