package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.ComplexCommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectComlexCommandSquare implements ActionListener {

    private DriverManager driverManager;

    public SelectComlexCommandSquare(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        ComplexCommand command = ComplexCommandFactory.createShape("square");
        command.execute(driverManager.getCurrentDriver());
    }
}
