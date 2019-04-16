package edu.kis.powp.jobs2d;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

public class CommandComplexTest {
    private static Job2dDriver driver = new StubDriver();

    public static void main(String[] args) {
        ComplexCommand commandComplexTest = new ComplexCommand();
        commandComplexTest.addCommand(new SetPositionCommand(driver, -120, -120));
        commandComplexTest.addCommand(new OperateToCommand(driver, 120, -120));
        commandComplexTest.addCommand(new OperateToCommand(driver, 120, 120));
        commandComplexTest.addCommand(new OperateToCommand(driver, -120, 120));
        commandComplexTest.addCommand(new OperateToCommand(driver, -120, -120));
        commandComplexTest.addCommand(new OperateToCommand(driver, 120, 120));
        commandComplexTest.addCommand(new SetPositionCommand(driver, 120, -120));
        commandComplexTest.addCommand(new OperateToCommand(driver, -120, 120));

        commandComplexTest.execute();
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
