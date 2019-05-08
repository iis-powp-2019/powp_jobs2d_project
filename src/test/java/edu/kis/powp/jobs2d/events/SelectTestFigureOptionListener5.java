package edu.kis.powp.jobs2d.events;

import command.ComplexCommand;
import command.DriverCommand;
import command.OperateToCommand;
import command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class SelectTestFigureOptionListener5 implements ActionListener {
    private DriverManager driverManager;

    public SelectTestFigureOptionListener5(DriverManager driverManager){
        this.driverManager = driverManager;
    }

    @Override public void actionPerformed(ActionEvent e) {
        Job2dDriver currentDriver = driverManager.getCurrentDriver();

        List<DriverCommand> driverCommands = Arrays.asList(
                new SetPositionCommand(currentDriver, -200, 100),
                new OperateToCommand(currentDriver, -200, 200),
                new OperateToCommand(currentDriver, 200, 200),
                new OperateToCommand(currentDriver, -200, 100)
        );

        new ComplexCommand(driverCommands).execute();
    }
}
