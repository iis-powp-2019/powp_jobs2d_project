package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.CommandFigureFactory.CommandFigureFactory;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectCommandTriangle implements ActionListener {
    private DriverManager driverManager;

    public SelectCommandTriangle(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new ComplexCommand()
                .addCommand(CommandFigureFactory.getTriangle(driverManager))
                .execute();
    }
}
