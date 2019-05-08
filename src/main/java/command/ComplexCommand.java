package command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.sql.Driver;
import java.util.List;

public class ComplexCommand implements DriverCommand{

    public List<DriverCommand> listOfCommands;

    public ComplexCommand(List<DriverCommand> list){
        this.listOfCommands = list;
    }

    @Override public void execute() {
        for (DriverCommand command:listOfCommands){
            command.execute();
        }
    }
}
