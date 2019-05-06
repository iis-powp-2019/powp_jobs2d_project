package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.ComplexCommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectComplexCommandOptionListener implements ActionListener {

    private DriverManager driverManager;
    private ComplexCommandFactory complexCommandFactory = new ComplexCommandFactory();

    public SelectComplexCommandOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("TRIANGLE"))
            complexCommandFactory.getShape("TRIANGLE", driverManager.getCurrentDriver()).execute();
        else if (e.getActionCommand().equalsIgnoreCase("SQUARE"))
            complexCommandFactory.getShape("SQUARE", driverManager.getCurrentDriver()).execute();
    }
}
