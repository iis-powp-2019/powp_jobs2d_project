package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

public interface DriverCommand
{
    public Job2dDriver job2dDriver = null;
    public void execute();
}
