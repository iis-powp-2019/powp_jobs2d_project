package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.command.factory.ComplexCommandFactory;
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
		ComplexCommand complexCommand = ComplexCommandFactory.getRectangle(driverManager.getCurrentDriver());
		complexCommand.execute();
	}
}
