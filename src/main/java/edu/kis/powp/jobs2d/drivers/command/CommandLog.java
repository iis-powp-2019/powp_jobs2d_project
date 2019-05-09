package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandLog implements Job2dDriver {

    private static ComplexCommand complexCommand = new ComplexCommand();
    private static Job2dDriver driver = null;
    private static CommandLog Instance = null;

    private CommandLog() {
    }

    public static CommandLog getInstance() {
        if (Instance == null)
            Instance = new CommandLog();
        return Instance;
    }

    public static void setDriver(Job2dDriver driver) {
        CommandLog.driver = driver;
    }

    @Override
    public void setPosition(int x, int y) {
        complexCommand.addCommand(new SetPositionCommand(driver,x, y));
    }

    @Override
    public void operateTo(int x, int y) {
        complexCommand.addCommand(new OpareteToCommand(driver,x, y ));
    }

    public ComplexCommand getComplexCommand() {
        return complexCommand;
    }

}
