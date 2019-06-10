package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestOptionCommandTriangle implements ActionListener {

    private DriverManager driverManager;

    public SelectTestOptionCommandTriangle(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand complexCommand = edu.kis.powp.jobs2d.drivers.factory.CommandFactory.drawTriangle();
        complexCommand.execute(driverManager.getCurrentDriver());
    }
}
