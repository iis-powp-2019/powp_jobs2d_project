package command;

import java.util.ArrayList;

public class ComplexCommand {
    ArrayList<DriverCommand> commandQueue;

    public ComplexCommand(ArrayList<DriverCommand> commandQueue) {
        this.commandQueue = commandQueue;
    }
    public void execute()
    {
        for (DriverCommand command : commandQueue){
            if (command instanceof DriverCommand){
                command.execute();
            }
        }
    }
    public void addCommend(DriverCommand driverCommand)
    {
        commandQueue.add(driverCommand);
    }
}
