package edu.kis.powp.jobs2d;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandTest {

    public static void main(String[] args) {
        Job2dDriver job2dDriver = new StubDriver();
        List<DriverCommand> com = new ArrayList<>();

        com.add(new SetPositionCommand(0, 0, job2dDriver));
        com.add(new OperateToCommand(0, -200, job2dDriver));
        com.add(new OperateToCommand(200, -200, job2dDriver));
        com.add(new OperateToCommand(200, 0, job2dDriver));
        com.add(new OperateToCommand(0, 0, job2dDriver));

        new ComplexCommand(com).execute();

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

    ;
}
