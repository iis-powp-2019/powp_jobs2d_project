package edu.kis.powp.jobs2d.commands;

public class CommandFactory {

	public static ComplexCommand getRectangleDrawing() {
		ComplexCommand cmd = new ComplexCommand();
		
		cmd.addCommand(new SetPositionCommand(50, 50));
		cmd.addCommand(new OperateToCommand(-50, 50));
		cmd.addCommand(new OperateToCommand(-50, -50));
		cmd.addCommand(new OperateToCommand(50, -50));
		cmd.addCommand(new OperateToCommand(50, 50));
		
		return cmd;
	}
	
	public static ComplexCommand getTriangleDrawing() {
		ComplexCommand cmd = new ComplexCommand();
		
		cmd.addCommand(new SetPositionCommand(-50, -50));
		cmd.addCommand(new OperateToCommand(50, 0));
		cmd.addCommand(new OperateToCommand(-50, 50));
		cmd.addCommand(new OperateToCommand(-50, -50));
		
		return cmd;
	}
	
}
