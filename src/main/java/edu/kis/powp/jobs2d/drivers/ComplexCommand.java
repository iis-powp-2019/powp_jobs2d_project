package edu.kis.powp.jobs2d.drivers;

import java.util.LinkedList;

public class ComplexCommand implements DriverCommand
{
	private LinkedList<DriverCommand> list;
	
	
	public ComplexCommand(LinkedList<DriverCommand> list) {
		this.list = list;
	}

	@Override
	public void execute() {
		for(DriverCommand e: list)
		{
			e.execute();
		}
	}
}

//Wzorzec Composite
