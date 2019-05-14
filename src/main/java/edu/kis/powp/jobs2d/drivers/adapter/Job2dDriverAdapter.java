package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class Job2dDriverAdapter
		extends AbstractDriver
{
	
	public Job2dDriverAdapter()
	{
		super(0, 0);
	}
	
	@Override
	public void operateTo(int x, int y)
	{
		DriverFeature.getDriverManager().getCurrentDriver().setPosition(getX(), getY());
		DriverFeature.getDriverManager().getCurrentDriver().operateTo(x, y);
		setPosition(x, y);
	}
}
