package edu.kis.powp.jobs2d;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandTest {

    public static void Test(Job2dDriver driver){
        ComplexCommand testCommand = new ComplexCommand();

        testCommand.commands.add(new SetPositionCommand(0,0));
        testCommand.commands.add(new OperateToCommand(40,30));

        testCommand.execute(driver);

    }
}
