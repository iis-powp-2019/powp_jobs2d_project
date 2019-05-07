package edu.kis.powp.jobs2d.commands;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand
{
    private List<DriverCommand> commandList = new ArrayList<>();

    public void addCommand(DriverCommand driver){
        commandList.add(driver);
    }

    @Override
    public void execute(){
        commandList.forEach(comm -> comm.execute());
    }
}
