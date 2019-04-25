package edu.kis.powp.jobs2d.command;

import java.util.List;

public class ComplexCommand implements DriverCommand{

    private List<DriverCommand> listDriverCommands;

    public ComplexCommand(List<DriverCommand> listDriverCommands) {
        this.listDriverCommands = listDriverCommands;
    }

    public void execute() {
        for(int i = 0; i < listDriverCommands.size(); i++) {
            listDriverCommands.get(i).execute();
        }
    }

}
