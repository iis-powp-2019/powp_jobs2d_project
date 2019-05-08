package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class SelectCommandTriangleOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectCommandTriangleOptionListener(DriverManager driverManager){
        this.driverManager = driverManager;
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        Job2dDriver currentDriver = driverManager.getCurrentDriver();

        List<DriverCommand> driverCommands = Arrays.asList(
            new SetPositionCommand(75, 75),
            new OperateToCommand(75, -75),
            new OperateToCommand(-75, -75),
            new OperateToCommand(75, 75)
        );

        new ComplexCommand(driverCommands).execute(currentDriver);
    }
}