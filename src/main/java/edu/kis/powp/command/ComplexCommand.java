package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{

    private List<DriverCommand> commadnsList = new ArrayList<>();

    public void addCommand(DriverCommand driverCommand){
        commadnsList.add(driverCommand);
    }

    @Override
    public void execute() {
        for (DriverCommand driverCommand:commadnsList) {
            driverCommand.execute();
        }
    }
}
