package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.command.ComplexCommandFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectComplexTriangle implements ActionListener {

    private DriverManager driverManager;

    public SelectComplexTriangle(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new ComplexCommandFactory(driverManager.getCurrentDriver()).create("triangle").execute();
    }

}
