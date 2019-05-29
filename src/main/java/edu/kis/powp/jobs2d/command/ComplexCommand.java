package edu.kis.powp.jobs2d.command;


import javafx.util.Pair;

import java.util.LinkedHashMap;
import java.util.Map;

public class ComplexCommand {
    private Map<DriverCommand, Pair<Integer, Integer>> commands;

    public ComplexCommand(Map<DriverCommand, Pair<Integer, Integer>> commands) {
        this.commands = commands;
    }

    public ComplexCommand() {
        commands = new LinkedHashMap<>();
    }


    public void execute() {
        for (DriverCommand temp :
                commands.keySet()) {
            temp.execute(commands.get(temp).getKey(), commands.get(temp).getValue());
        }
    }

    public void addCommand(DriverCommand driverCommand, Pair<Integer, Integer> integerPair) {
        commands.put(driverCommand, integerPair);
    }
}
