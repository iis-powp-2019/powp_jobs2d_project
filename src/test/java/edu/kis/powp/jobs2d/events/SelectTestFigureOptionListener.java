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

	private Consumer<Job2dDriver> consumer;
	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager, Consumer<Job2dDriver> consumer) {
		this.driverManager = driverManager;
		this.consumer = consumer;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		consumer.accept(driverManager.getCurrentDriver());
		OperateToCommand operateToCommand = new OperateToCommand(driverManager.getCurrentDriver());
		SetPositionCommand setPositionCommand = new SetPositionCommand(driverManager.getCurrentDriver());

		setPositionCommand.execute(100, 100);
		operateToCommand.execute(-100, -100);

	}
}
