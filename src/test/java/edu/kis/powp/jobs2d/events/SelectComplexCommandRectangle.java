package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.ComplexCommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectComplexCommandRectangle implements ActionListener {

    private DriverManager driverManager;


    public SelectComplexCommandRectangle(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand command = ComplexCommandFactory.createShape("rectangle");
        command.execute(driverManager.getCurrentDriver());
    }
}
