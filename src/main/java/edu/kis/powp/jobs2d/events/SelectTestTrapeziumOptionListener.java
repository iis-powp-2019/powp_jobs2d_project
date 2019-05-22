package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.FigureFactory;
import edu.kis.powp.jobs2d.drivers.adapter.AbstractDriverAdapter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestTrapeziumOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestTrapeziumOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(driverManager.getCurrentDriver() instanceof AbstractDriverAdapter)
            FigureFactory.trapeziumFactory(driverManager).execute();
    }

}
