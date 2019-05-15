package edu.kis.powp.jobs2d.comand;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class CommandsTest {
    private static Job2dDriver driver = new StubDriver();


    public static void main(String[] args) {
        DriverCommand setPositionCommand = new SetPositionCommand(driver, 4, 5);
        DriverCommand operateToCommand = new OperateToCommand(driver, 7, 8);

        setPositionCommand.execute();
        operateToCommand.execute();

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
    };
}
