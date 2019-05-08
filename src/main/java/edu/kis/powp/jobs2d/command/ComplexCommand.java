package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {

    private ArrayList<DriverCommand> complexCommandsList = new ArrayList<>();

    public void addCommand(DriverCommand driver) {
        complexCommandsList.add(driver);
    }

    @Override
    public void execute() {
        for (DriverCommand command : complexCommandsList) {
            command.execute();
        }

    }

}