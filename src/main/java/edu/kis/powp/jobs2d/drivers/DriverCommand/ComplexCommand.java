package edu.kis.powp.jobs2d.drivers.DriverCommand;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> commandList;

    public ComplexCommand() {
        this.commandList = new ArrayList<DriverCommand>();
    }

    public void addCommand(DriverCommand driverCommand){
        commandList.add(driverCommand);
    }

    @Override
    public void execute(){
        for(DriverCommand driverCommand: commandList){
            driverCommand.execute();
        }
    }
}
