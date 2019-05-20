package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private List<DriverCommand> driverCommandList = new ArrayList();
    public ComplexCommand(){

    }

    public void addCommand(DriverCommand driverCommand){
        driverCommandList.add(driverCommand);

    }
    @Override
    public void execute(Job2dDriver job2dDriver) {
        for(DriverCommand command : driverCommandList) {
            command.execute(job2dDriver);
        }
    }
}
