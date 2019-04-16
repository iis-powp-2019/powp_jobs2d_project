package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.List;

public class ComplexCommand implements DriverCommand {

	private List<DriverCommand> commandsToExecute;

	public ComplexCommand(List<DriverCommand> commandsToExecute) {
		this.commandsToExecute = commandsToExecute;
	}

	@Override
	public void execute() {
		for (DriverCommand command : this.commandsToExecute) {
			command.execute();
		}
	}
}
