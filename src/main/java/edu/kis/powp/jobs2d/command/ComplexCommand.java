package edu.kis.powp.jobs2d.command;

import java.util.List;

public class ComplexCommand implements DriverCommand {

	private List<DriverCommand> commands;

	public void addCommand(DriverCommand driver) {
		commands.add(driver);
	}

	@Override
	public void execute() {
		for (DriverCommand command : commands) {
			command.execute();
		}
	}
	
}
