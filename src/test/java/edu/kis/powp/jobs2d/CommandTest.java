package edu.kis.powp.jobs2d;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandTest {

    public static void Test(Job2dDriver driver){
        List<DriverCommand> commands = new ArrayList<>();

        commands.add(new SetPositionCommand(0,0));
        commands.add(new OperateToCommand(40,30));

        for (DriverCommand command:commands) {
            command.execute(driver);
        }

    }
}
