package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;
import java.util.List;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class ComplexCommandFactory {
	public static ComplexCommand rectangleDrawing(DriverManager drivermanager) {
		
		List<DriverCommand> list=new ArrayList<>();
		list.add(new SetPositionCommand(0,0,drivermanager.getCurrentDriver()));
		list.add(new OperateToCommand(-150,0,drivermanager.getCurrentDriver()));
		list.add(new OperateToCommand(-150,-50,drivermanager.getCurrentDriver()));
		list.add(new OperateToCommand(0,-50,drivermanager.getCurrentDriver()));
		list.add(new OperateToCommand(0,0,drivermanager.getCurrentDriver()));
		
		ComplexCommand complexcommand=new ComplexCommand(list);
		
		return complexcommand;
	}
	
	public static ComplexCommand triangleDrawing(DriverManager drivermanager) {
		
		List<DriverCommand> list=new ArrayList<>();
		list.add(new SetPositionCommand(0,0,drivermanager.getCurrentDriver()));
		list.add(new OperateToCommand(-150,0,drivermanager.getCurrentDriver()));
		list.add(new OperateToCommand(0,250,drivermanager.getCurrentDriver()));
		list.add(new OperateToCommand(0,0,drivermanager.getCurrentDriver()));
		
		ComplexCommand complexcommand=new ComplexCommand(list);
		
		return complexcommand;
	}
}
