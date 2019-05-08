package edu.kis.powp.jobs2d.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
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
		List<DriverCommand> list = new ArrayList<>();

		list.add(new SetPositionCommand(driverManager.getCurrentDriver(),100,200));
		list.add(new OperateToCommand(driverManager.getCurrentDriver(),-10,-10));
		list.add(new OperateToCommand(driverManager.getCurrentDriver(),-200,-100));
		list.add(new OperateToCommand(driverManager.getCurrentDriver(),130,-150));
		ComplexCommand complexCommand = new ComplexCommand(list);
		complexCommand.execute();



	}
}
