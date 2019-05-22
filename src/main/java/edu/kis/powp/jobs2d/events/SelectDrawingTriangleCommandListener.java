package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverCommand.*;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectDrawingTriangleCommandListener implements ActionListener {
    private DriverManager driverManager;

    public SelectDrawingTriangleCommandListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DriverCommand driverCommand = FabricFigureCommand.triangleDrawingCommand(driverManager);
        driverCommand.execute();
    }
}
