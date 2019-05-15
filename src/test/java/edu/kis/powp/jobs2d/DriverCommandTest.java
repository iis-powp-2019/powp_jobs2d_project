package edu.kis.powp.jobs2d;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class DriverCommandTest {
    public static void main(String[] args) {
        Job2dDriver job2dDriver = new StubDriver();

        OperateToCommand operateToCommand = new OperateToCommand(job2dDriver, 5, 5);
        operateToCommand.execute();

        SetPositionCommand setPositionCommand = new SetPositionCommand(job2dDriver,5, 5);
        setPositionCommand.execute();
    }

    private static class StubDriver implements Job2dDriver {

        @Override
        public void operateTo(int x, int y) {
            System.out.println("Driver operateTo action: ");
        }

        @Override
        public void setPosition(int x, int y) {
            System.out.println("Driver setPosition action: ");
        }
    }
}
