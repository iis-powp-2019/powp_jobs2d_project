package edu.kis.powp.jobs2d;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperetaToCommand;
import edu.kis.powp.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandTest {

    public static void main(String[] args) {

        Job2dDriver job2dDriver = new StubDriver();

        List<DriverCommand> commands = new ArrayList<>();

        commands.add(new SetPositionCommand(-60,-60,job2dDriver));
        commands.add(new OperetaToCommand(60,-60,job2dDriver));
        commands.add(new OperetaToCommand(60,60,job2dDriver));
        commands.add(new OperetaToCommand(-60,60,job2dDriver));
        commands.add(new OperetaToCommand(-60,-60,job2dDriver));
        commands.add(new OperetaToCommand(60,60,job2dDriver));
        commands.add(new SetPositionCommand(60,-60,job2dDriver));
        commands.add(new OperetaToCommand(-60,60,job2dDriver));

        new ComplexCommand(commands).execute();

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
