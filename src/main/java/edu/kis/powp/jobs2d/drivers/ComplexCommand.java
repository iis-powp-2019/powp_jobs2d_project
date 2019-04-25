package edu.kis.powp.jobs2d.drivers;

import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> listOfCommand;

    public ComplexCommand(List<DriverCommand> list){
        listOfCommand = list;
    }
    
    @Override
    public void execute() {
        for( DriverCommand item : listOfCommand){
            item.execute();
        }
    }
}
