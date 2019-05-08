package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements  DriverCommand{

    private List<DriverCommand> listDriverCommand = new ArrayList<>();

    public ComplexCommand(List<DriverCommand> listDriverCommand){
        this.listDriverCommand = listDriverCommand;
    }

    @Override
    public void execute() {
        for(DriverCommand driverCommand : listDriverCommand){
            driverCommand.execute();
        }
    }
}
