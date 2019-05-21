package edu.kis.powp.jobs2d.drivers;

import java.util.ArrayList;
import command.DriverCommand;

public class ComplexCommand implements DriverCommand{
	private ArrayList<DriverCommand> list = new ArrayList<DriverCommand>();
	public ComplexCommand(ArrayList<DriverCommand> list) {
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


