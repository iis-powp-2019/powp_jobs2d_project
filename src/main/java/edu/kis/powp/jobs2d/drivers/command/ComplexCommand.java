package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand {

    private List<DriverCommand> driverCommandsList = new ArrayList<>();


    public void addCommand(DriverCommand driver) {
        driverCommandsList.add(driver);
    }

    public void execute() {
        driverCommandsList.forEach(DriverCommand::execute);
    }

}
