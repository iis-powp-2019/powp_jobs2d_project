package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandTest {

    public static void main(String[] args) {
        Job2dDriver job2dDriver = new StubDriver();
        DriverCommand setPositionCommand = new SetPositionCommand(job2dDriver, 0, 5);
        DriverCommand operateToCommand = new OperateToCommand(job2dDriver, 15, 20);

        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(setPositionCommand);
        commandList.add(operateToCommand);

        DriverCommand complexCommand = new ComplexCommand(commandList, job2dDriver);
        complexCommand.execute();
    }

    private static class StubDriver implements Job2dDriver {

        @Override
        public void operateTo(int x, int y) {
            System.out.println("Driver operateTo action...");
        }

        @Override
        public void setPosition(int x, int y) {
            System.out.println("Driver setPosition action...");
        }
    }

}
