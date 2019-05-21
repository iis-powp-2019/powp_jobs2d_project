package edu.kis.powp.command;
import java.util.ArrayList;
import java.util.List;

import edu.kis.powp.jobs2d.Job2dDriver;


public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> commands = new ArrayList<>();


    public void addCommand(DriverCommand cmd) {
        commands.add(cmd);
    }

    @Override
    public void execute(Job2dDriver driver) {
        for(DriverCommand command : commands) {
            command.execute(driver);
        }
    }

}