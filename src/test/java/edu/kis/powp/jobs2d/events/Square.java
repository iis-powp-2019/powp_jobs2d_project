package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.CommandFactory;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Square implements ActionListener {
    private DriverManager driverManager;

    public Square(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand complexCommand=new ComplexCommand();
        complexCommand.addCommand(CommandFactory.getSquare(driverManager));
        complexCommand.execute();

    }
}