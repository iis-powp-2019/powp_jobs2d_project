package edu.kis.powp.command;

import java.util.List;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommand implements DriverCommand{

	public void executeAll(Job2dDriver _object, List<DriverCommand> _commands) {
		for( DriverCommand command : _commands )
			command.execute(_object);
	}

	@Override
	public void execute(Job2dDriver object) {
		
	}

}
