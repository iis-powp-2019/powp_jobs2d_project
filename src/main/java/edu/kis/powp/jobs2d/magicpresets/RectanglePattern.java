package edu.kis.powp.jobs2d.magicpresets;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class RectanglePattern {
	
	public static ComplexCommand rectangleScript(DriverManager driverManager) {
		ComplexCommand command = new ComplexCommand();
		
		command.addToDriverCommandList(new SetPositionCommand(driverManager.getCurrentDriver(), 80,80));
		command.addToDriverCommandList(new OperateToCommand(driverManager.getCurrentDriver(), 80,-80));
		command.addToDriverCommandList(new OperateToCommand(driverManager.getCurrentDriver(), -80,-80));
		command.addToDriverCommandList(new OperateToCommand(driverManager.getCurrentDriver(), -80,80));
		command.addToDriverCommandList(new OperateToCommand(driverManager.getCurrentDriver(), 80,80));
		
		return command;
	}
}
