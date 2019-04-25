package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.commands.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestFigureOptionListener3 implements ActionListener {

    private DriverManager driverManager;
    private DriverCommand figure;

    public SelectTestFigureOptionListener3(DriverManager driverManager, DriverCommand figure) {
        this.driverManager = driverManager;
        this.figure = figure;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        figure.execute();
    }
}
