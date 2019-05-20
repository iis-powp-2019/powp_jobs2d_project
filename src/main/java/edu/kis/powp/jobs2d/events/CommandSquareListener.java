package edu.kis.powp.jobs2d.events;


import edu.kis.powp.jobs2d.commands.ComplexCommand;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.ShapeFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommandSquareListener implements ActionListener
{
    private DriverManager driverManager;

    public CommandSquareListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        ComplexCommand command = ShapeFactory.drawSquare();
        command.execute(driverManager.getCurrentDriver());
    }
}