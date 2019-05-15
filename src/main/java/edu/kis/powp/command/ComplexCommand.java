package edu.kis.powp.command;

import java.util.List;

public class ComplexCommand implements DriverCommand{

    public List<DriverCommand> list;

    public ComplexCommand(List<DriverCommand> list){
        this.list = list;
    }

    @Override public void execute() {
        for (DriverCommand command:list){
            command.execute();
        }   
    }
}