package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandLogger implements Job2dDriver {
    private static ComplexCommand complexCommand = new ComplexCommand();
    private static Job2dDriver driver = null;
    private static CommandLogger Instance = null;

    private CommandLogger() {
    }

    public static CommandLogger getInstance() {
        if(Instance == null)
            Instance = new CommandLogger();
        return Instance;
    }

    public static void setDriver(Job2dDriver driver) {
        CommandLogger.driver = driver;
    }

    @Override
    public void setPosition(int x, int y) {
        complexCommand.addCommand(new SetPositionCommand(x, y, driver));
    }

    @Override
    public void operateTo(int x, int y) {
        complexCommand.addCommand(new OperateToCommand(x, y, driver));
    }

    public ComplexCommand getComplexCommand() {
        return complexCommand;
    }
}
