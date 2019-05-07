package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.CircleFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestFigureOptionListener4 implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionListener4(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand complexCommand = CircleFactory.createRectangle(driverManager);
        complexCommand.execute();
    }
}
