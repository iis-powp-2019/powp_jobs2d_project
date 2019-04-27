package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.CyrcleFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectCommandCyrcleTestOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectCommandCyrcleTestOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand complex = CyrcleFactory.createCyrcle(driverManager);
        complex.execute();
    }
}
