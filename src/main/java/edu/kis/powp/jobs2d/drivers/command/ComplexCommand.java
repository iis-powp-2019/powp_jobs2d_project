package edu.kis.powp.jobs2d.drivers.command;

import java.util.LinkedList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private List<DriverCommand> list=new LinkedList<DriverCommand>();
    @Override
    public void execute() {
        for (DriverCommand command: list
             ) {
            command.execute();
        }
    }
    public void addCommand(DriverCommand command){
        list.add(command);
    }
}
