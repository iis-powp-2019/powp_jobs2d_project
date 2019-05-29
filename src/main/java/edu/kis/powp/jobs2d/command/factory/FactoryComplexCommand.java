package edu.kis.powp.jobs2d.command.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import javafx.util.Pair;

import java.util.LinkedHashMap;

public class FactoryComplexCommand {
    private static LinkedHashMap<DriverCommand, Pair<Integer, Integer>> command;

    public static ComplexCommand getRectangle(Job2dDriver job2dDriver) {
        command = new LinkedHashMap<>();

        command.put(new SetPositionCommand(job2dDriver), new Pair<>(100, 100));
        command.put(new OperateToCommand(job2dDriver), new Pair<>(-100, 100));
        command.put(new OperateToCommand(job2dDriver), new Pair<>(-100, 0));
        command.put(new OperateToCommand(job2dDriver), new Pair<>(100, 0));
        command.put(new OperateToCommand(job2dDriver), new Pair<>(100, 100));
        return new ComplexCommand(command);
    }
}
