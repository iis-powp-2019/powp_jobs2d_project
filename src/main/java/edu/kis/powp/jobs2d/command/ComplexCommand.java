package edu.kis.powp.jobs2d.command;

import java.util.List;

public class ComplexCommand implements DriverCommand{

    private List<DriverCommand> list;

    public ComplexCommand(List<DriverCommand> list) {
        this.list = list;
    }

    @Override
    public void execute() {
        for (DriverCommand element: list
             ) {
            element.execute();
        }
    }
}
