package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectComplexCommandRectancleOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectComplexCommandRectancleOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommandFactory.figureScriptRectangle(driverManager.getCurrentDriver()).execute();
    }
}
