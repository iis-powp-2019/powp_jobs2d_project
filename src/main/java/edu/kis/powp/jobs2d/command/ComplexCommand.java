package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
//pytanie 3.1.4 odp: kompozyt
    private List<DriverCommand>  driverCommandList= new ArrayList<>();

    public ComplexCommand(List<DriverCommand> driverCommandList) {
        this.driverCommandList = driverCommandList;
    }


    public void execute(){
        for(DriverCommand driverCommand : driverCommandList){
            driverCommand.execute();
        }
    }
}
