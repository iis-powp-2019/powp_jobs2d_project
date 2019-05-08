package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.FigureCommandFabric;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectCommandSquareListener implements ActionListener
{
    private DriverManager driverManager;

    public SelectCommandSquareListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        ComplexCommand command = FigureCommandFabric.DrawSquareCommand(driverManager.getCurrentDriver());
        command.execute();
    }
}
