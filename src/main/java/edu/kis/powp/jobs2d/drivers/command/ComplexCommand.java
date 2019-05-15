package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {

    private ArrayList<DriverCommand> commandsArrayList = new ArrayList<>();

    public ComplexCommand(ArrayList<DriverCommand> commandsArrayList) {
        this.commandsArrayList = commandsArrayList;
    }

    @Override public void execute() {
        for (DriverCommand e : commandsArrayList)
            e.execute();
    }
}

