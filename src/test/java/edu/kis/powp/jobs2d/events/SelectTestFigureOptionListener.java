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
	private String namePattern;

	public SelectTestFigureOptionListener(DriverManager driverManager, String namePattern) {
		this.driverManager = driverManager;
		this.namePattern = namePattern;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(namePattern.equals("Figures Joe 1")) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}
		else if(namePattern.equals("Figures Joe 2")) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
		else if(namePattern.equals("Figures Joe 3")) {

			List<DriverCommand> listDriverCommands = new ArrayList<>();

			listDriverCommands.add(new SetPositionCommand(80, 80, driverManager.getCurrentDriver()));
			listDriverCommands.add(new OperateToCommand(-80, -80, driverManager.getCurrentDriver()));
			listDriverCommands.add(new OperateToCommand(80, -80, driverManager.getCurrentDriver()));
			listDriverCommands.add(new OperateToCommand(80, 80, driverManager.getCurrentDriver()));
			listDriverCommands.add(new OperateToCommand(-80, 80, driverManager.getCurrentDriver()));
			listDriverCommands.add(new OperateToCommand(-80, -80, driverManager.getCurrentDriver()));
			listDriverCommands.add(new OperateToCommand(0, -160, driverManager.getCurrentDriver()));
			listDriverCommands.add(new OperateToCommand(80, -80, driverManager.getCurrentDriver()));
			listDriverCommands.add(new OperateToCommand(-80, 80, driverManager.getCurrentDriver()));


			ComplexCommand complexCommand = new ComplexCommand(listDriverCommands);
			complexCommand.execute();
		}
		else if(namePattern.equals("Figures Joe 4")) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
	}
}
