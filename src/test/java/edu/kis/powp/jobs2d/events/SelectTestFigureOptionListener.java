package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private Consumer<Job2dDriver> script;

	public SelectTestFigureOptionListener(DriverManager driverManager, Consumer<Job2dDriver> script) {
		this.driverManager = driverManager;
		this.script = script;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		//script.accept(driverManager.getCurrentDriver());
		new SetPositionCommand(-120, -120).execute(driverManager.getCurrentDriver());
		new OperateToCommand(120, -120).execute(driverManager.getCurrentDriver());
		new OperateToCommand(60, 60).execute(driverManager.getCurrentDriver());
		new OperateToCommand(-120, -120).execute(driverManager.getCurrentDriver());
	}
}
