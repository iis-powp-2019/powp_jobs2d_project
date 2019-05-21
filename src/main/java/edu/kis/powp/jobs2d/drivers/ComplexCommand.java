package edu.kis.powp.jobs2d.drivers;

import java.util.ArrayList;

import command.DriverCommand;

public class ComplexCommand implements DriverCommand{
	
	private ArrayList<DriverCommand> list;
	
	public ComplexCommand(ArrayList<DriverCommand> list){
		list = new ArrayList<DriverCommand>();
		this.list.addAll(list);
	}

	public ComplexCommand(DriverCommand driverCommand){
		list = new ArrayList<DriverCommand>();
		list.add(driverCommand);
	}

	public ComplexCommand() {
		list = new ArrayList<DriverCommand>();
	}
	
	public void addCommand(DriverCommand driverCommand){
		list.add(driverCommand);
	}
	
	@Override
	public void execute() {
		for(DriverCommand e: list)
		{
			e.execute();
		}
	}

}
