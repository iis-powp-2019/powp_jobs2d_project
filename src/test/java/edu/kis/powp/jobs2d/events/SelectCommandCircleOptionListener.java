package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.CircleFactory;
import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectCommandCircleOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectCommandCircleOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand complex = CircleFactory.drawCircle(driverManager);
        complex.execute();
    }
}
