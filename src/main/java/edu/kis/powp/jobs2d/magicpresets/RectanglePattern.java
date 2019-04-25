package edu.kis.powp.jobs2d.magicpresets;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

public class RectanglePattern {
	
	public static ComplexCommand rectangleScript() {
		ComplexCommand command = new ComplexCommand();
		command.addToDriverCommandList(new SetPositionCommand(80,80));
		command.addToDriverCommandList(new OperateToCommand(80,-80));
		command.addToDriverCommandList(new OperateToCommand(-80,-80));
		command.addToDriverCommandList(new OperateToCommand(-80,80));
		command.addToDriverCommandList(new OperateToCommand(80,80));
		
		return command;
	}
}
