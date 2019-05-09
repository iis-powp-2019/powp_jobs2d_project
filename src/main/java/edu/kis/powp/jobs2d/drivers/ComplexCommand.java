package edu.kis.powp.jobs2d.drivers;

import java.util.LinkedList;

public class ComplexCommand implements DriverCommand
{
	private LinkedList<DriverCommand> list;
	
	
	public ComplexCommand(LinkedList<DriverCommand> list){
		list = new LinkedList<DriverCommand>();
		this.list.addAll(list);
	}

	public ComplexCommand(DriverCommand driverCommand){
		list = new LinkedList<DriverCommand>();
		list.add(driverCommand);
	}
	
	public ComplexCommand() {
		list = new LinkedList<DriverCommand>();
	}

	@Override
	public void execute() {
		for(DriverCommand e: list)
		{
			e.execute();
		}
	}
	
	public void addCommand(DriverCommand dc){
		list.add(dc);
	}
}

//Wzorzec Composite
