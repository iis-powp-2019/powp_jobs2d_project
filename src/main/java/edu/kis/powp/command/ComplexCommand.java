package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommand implements DriverCommand{

	private List<DriverCommand> driverCommandList;
	
	public ComplexCommand() {
		driverCommandList = new ArrayList<DriverCommand>();
	}
	
	public void addToDriverCommandList(DriverCommand command) {
		driverCommandList.add(command);
	}

	@Override
	public void execute() {
		for(DriverCommand dc : driverCommandList) {
			dc.execute();
		}
	}
}