package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> list = new ArrayList<>();

    public ComplexCommand(List<DriverCommand> list) {
        this.list = list;
    }

    public void commandAdd(DriverCommand command){
        list.add(command);
    }

    @Override
    public void execute() {
        list.forEach(DriverCommand::execute);
    }

}
