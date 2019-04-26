package command;

import edu.kis.powp.jobs2d.Job2dDriver;


import java.util.ArrayList;

public class TestCommand {
    ArrayList<DriverCommand> commandQueue = new ArrayList<>();

    public static void main(String[] args) {

        TestCommand ds = new TestCommand();
        ds.test();
    }

    private void test() {
        int x = 1, y = 1;
        Job2dDriver job2dDriver = new Job2dDriverSampleImplementation();
        commandQueue.add(new SetPositionCommand(x, y, job2dDriver));
        commandQueue.add(new SetPositionCommand(x, y, job2dDriver));
        commandQueue.add(new SetPositionCommand(x, y, job2dDriver));
        commandQueue.add(new OperateToCommand(x, y, job2dDriver));
        ComplexCommand complexCommand = new ComplexCommand(commandQueue);
        complexCommand.addCommend(new OperateToCommand(x + 1, y + 1, job2dDriver));
        complexCommand.execute();


    }
}
