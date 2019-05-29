package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//new SetPositionCommand(0, 100).execute(driverManager.getCurrentDriver());
		new OperateToCommand(0, 100).execute(driverManager.getCurrentDriver());
		new OperateToCommand(100, 200).execute(driverManager.getCurrentDriver());
		//new OperateToCommand(100, 100).execute(driverManager.getCurrentDriver());
	}

}
