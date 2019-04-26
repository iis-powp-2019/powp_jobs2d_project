package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;


public class CommandTest {

    private static Job2dDriver job2dDriver = new StubDriver();

    public static void main(String[] args) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.add(new SetPositionCommand(job2dDriver, 100, 20));
        complexCommand.add(new OperateToCommand(job2dDriver, 100, -20));
        complexCommand.add(new OperateToCommand(job2dDriver, -100, -20));
        complexCommand.add(new OperateToCommand(job2dDriver, -100, 20));
        complexCommand.add(new OperateToCommand(job2dDriver, 100, 20));
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
