package edu.kis.powp.jobs2d.drivers;

import java.util.LinkedList;

public class ComplexCommand implements DriverCommand
{
	private LinkedList<DriverCommand> lista = new LinkedList<DriverCommand>();

	public ComplexCommand() { }
	
	public ComplexCommand(LinkedList<DriverCommand> l)
	{
		lista.addAll(l);
	}
	
	public ComplexCommand(DriverCommand dc)
	{
		lista.add(dc);
	}
	
	public void addCommand(DriverCommand dc)
	{
		lista.add(dc);
	}
	
	@Override
	public void execute() 
	{
		for(DriverCommand dc : lista)
		{
			dc.execute();
		}
	}

}
