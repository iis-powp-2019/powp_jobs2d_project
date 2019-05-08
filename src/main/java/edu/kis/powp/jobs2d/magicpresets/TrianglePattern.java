package edu.kis.powp.jobs2d.magicpresets;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class TrianglePattern {

	public static ComplexCommand createTriangle(DriverManager driverManager) {
		ComplexCommand command = new ComplexCommand();
		
		command.addToDriverCommandList(new SetPositionCommand(driverManager.getCurrentDriver(), 80,80));
		command.addToDriverCommandList(new OperateToCommand(driverManager.getCurrentDriver(), 0,0));
		command.addToDriverCommandList(new OperateToCommand(driverManager.getCurrentDriver(), 160,0));
		command.addToDriverCommandList(new OperateToCommand(driverManager.getCurrentDriver(), 80,80));
		
		return command;
	}
}
