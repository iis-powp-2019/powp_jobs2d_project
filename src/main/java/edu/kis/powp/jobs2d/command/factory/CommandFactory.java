package edu.kis.powp.jobs2d.command.factory;

import java.util.ArrayList;
import java.util.List;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class CommandFactory {
	
	public static ComplexCommand drawRectangle(Job2dDriver job2dDriver) {
		
        ComplexCommand complexCommand;
        List<DriverCommand> commandList = new ArrayList<>();
        
        commandList.add(new SetPositionCommand(job2dDriver, 100, 100));
        commandList.add(new OperateToCommand(job2dDriver, -100, 100));
        commandList.add(new OperateToCommand(job2dDriver, -100, 0));
        commandList.add(new OperateToCommand(job2dDriver, 100, 0));
        commandList.add(new OperateToCommand(job2dDriver, 100, 100));
        
        complexCommand = new ComplexCommand(commandList);

        return complexCommand;
	}
	
public static ComplexCommand drawTriangle(Job2dDriver job2dDriver) {
		
        ComplexCommand complexCommand;
        List<DriverCommand> commandList = new ArrayList<>();
        
        commandList.add(new SetPositionCommand(job2dDriver, 100, 100));
        commandList.add(new OperateToCommand(job2dDriver, 100, 100));
        commandList.add(new OperateToCommand(job2dDriver, 0, 0));
        commandList.add(new OperateToCommand(job2dDriver, -100, 100));
        commandList.add(new OperateToCommand(job2dDriver, 100, 100));
        
        complexCommand = new ComplexCommand(commandList);

        return complexCommand;
	}

}
