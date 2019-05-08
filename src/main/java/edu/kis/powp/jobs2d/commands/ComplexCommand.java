package edu.kis.powp.jobs2d.commands;

import java.util.ArrayList;
import java.util.List;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

public class ComplexCommand implements DriverCommand {

	public ComplexCommand() {

	}

	public void addCommand(DriverCommand cmd) {
		cmdList.add(cmd);
	}

	@Override
	public void execute(Job2dDriver driver) {
		for(DriverCommand cmd : cmdList) {
			cmd.execute(driver);
		}
	}

	private List<DriverCommand> cmdList = new ArrayList<>();
}
