package edu.kis.powp.command;

import java.util.List;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommand implements DriverCommand{
	
	List<DriverCommand> commands;

	public ComplexCommand(List<DriverCommand> _commands) {
		this.commands = _commands;
	}

	public void execute() {
		if( !commands.isEmpty() )
			for( DriverCommand command : commands )
				command.execute();
	}

}
