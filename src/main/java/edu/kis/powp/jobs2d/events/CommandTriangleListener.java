package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.commands.ComplexCommand;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.ShapeFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommandTriangleListener implements ActionListener
{
    private DriverManager driverManager;

    public CommandTriangleListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        ComplexCommand command = ShapeFactory.drawTriangle();
        command.execute(driverManager.getCurrentDriver());
    }
}