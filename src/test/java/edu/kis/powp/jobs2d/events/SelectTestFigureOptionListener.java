package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.command.factory.ComplexCommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private String commandName;

	public SelectTestFigureOptionListener(DriverManager driverManager, String commandName) {
		this.driverManager = driverManager;
		this.commandName = commandName;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		//script.accept(driverManager.getCurrentDriver());
		ComplexCommandFactory.getInstance(commandName).execute(driverManager.getCurrentDriver());

	}
}
