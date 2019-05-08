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
		OperateToCommand operateToCommand = new OperateToCommand(driverManager.getCurrentDriver());
		SetPositionCommand setPositionCommand = new SetPositionCommand(driverManager.getCurrentDriver());
		setPositionCommand.execute(132,123);
		operateToCommand.execute(50,50);
		operateToCommand.execute(-100,-145);
	}
}
