package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.command.*;
import edu.kis.powp.jobs2d.features.DriverFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class SelectCommandFactoryOptionListener implements ActionListener {
    private DriverManager driverManager;
    private String type;

    public SelectCommandFactoryOptionListener(DriverManager driverManager,String type) {
        this.driverManager = driverManager;
        this.type = type;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DriverCommand command;
        if(type.equals("triangle"))
            command = CommandFactory.getTriangle(driverManager.getCurrentDriver());
        else if(type.equals("square"))
            command = CommandFactory.getSquare(driverManager.getCurrentDriver());
        else
            command = CommandFactory.getTriangle(driverManager.getCurrentDriver());
        command.execute();
        DriverFeature.updateDriverInfo();
    }
}