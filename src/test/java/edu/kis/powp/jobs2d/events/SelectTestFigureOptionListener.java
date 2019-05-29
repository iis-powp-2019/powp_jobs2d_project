package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.Map;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import javafx.util.Pair;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		LinkedHashMap<DriverCommand, Pair<Integer, Integer>> commands = new LinkedHashMap<>();

		OperateToCommand operateToCommand = new OperateToCommand(driverManager.getCurrentDriver());
		SetPositionCommand setPositionCommand = new SetPositionCommand(driverManager.getCurrentDriver());

		commands.put(operateToCommand, new Pair<>(-200, -200));

		commands.put(setPositionCommand, new Pair<>(200, 50));

		ComplexCommand complexCommand = new ComplexCommand(commands);
		complexCommand.execute();


		/*operateToCommand.execute(-200, -200);
		setPositionCommand.execute(200, 50);*/

	}

}
