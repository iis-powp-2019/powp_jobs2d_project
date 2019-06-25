package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{

    List<DriverCommand> commandList = new ArrayList<>();

    @Override
    public void execute(Job2dDriver job2dDriver) {
        for(DriverCommand d : commandList){
            d.execute(job2dDriver);
        }
    }

    public void addCommandToList(DriverCommand command){
        commandList.add(command);
    }
}
