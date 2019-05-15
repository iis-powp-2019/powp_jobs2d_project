package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.awt.*;

public class CommandFactory
{
	public static DriverCommand getRectCommands(Job2dDriver driver, Point start, Dimension size)
	{
		ComplexCommand toReturn = new ComplexCommand();
		
		toReturn.enqueue(new SetPositionCommand(driver, start.x, start.y));
		toReturn.enqueue(new OperateToCommand(driver, start.x + size.width, start.y));
		toReturn.enqueue(new OperateToCommand(driver, start.x + size.width, start.y + size.height));
		toReturn.enqueue(new OperateToCommand(driver, start.x, start.y + size.height));
		toReturn.enqueue(new OperateToCommand(driver, start.x, start.y));
		
		return toReturn;
	}
	
	public static DriverCommand getTriangelCommand(Job2dDriver driver, Point start, Dimension size)
	{
		ComplexCommand toReturn = new ComplexCommand();
		
		toReturn.enqueue(new SetPositionCommand(driver, start.x, start.y));
		toReturn.enqueue(new OperateToCommand(driver, start.x + size.width, start.y + size.height));
		toReturn.enqueue(new OperateToCommand(driver, start.x, start.y + size.height));
		toReturn.enqueue(new OperateToCommand(driver, start.x, start.y));
		
		return toReturn;
	}
	
	public static DriverCommand getCircleCommand(Job2dDriver driver, Point center, float radius)
	{
		ComplexCommand toReturn = new ComplexCommand();
		
		toReturn.enqueue(new SetPositionCommand(driver, (int)(Math.cos(0) * radius + center.x), (int)(Math.sin(0) * radius + center.y)));
		for(float angle = 0; angle <= Math.PI * 2; angle += 0.01)
		{
			int x = (int)(Math.cos(angle) * radius + center.x);
			int y = (int)(Math.sin(angle) * radius + center.y);
			toReturn.enqueue(new OperateToCommand(driver, x, y));
		}
		
		return toReturn;
		
	}
}
