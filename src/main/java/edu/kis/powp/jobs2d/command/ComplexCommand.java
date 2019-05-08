package edu.kis.powp.jobs2d.command;

import java.util.List;

public class ComplexCommand implements DriverCommand{

	private List<DriverCommand> commandsList;
	
	public ComplexCommand(List<DriverCommand> commandsList) {
		this.commandsList = commandsList;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
        for(int i = 0; i < commandsList.size(); i++) {
        	commandsList.get(i).execute();
        }
	}

}
