package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.AdapterToAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigure3OpctionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigure3OpctionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(driverManager.getCurrentDriver() instanceof AdapterToAdapter)
            FiguresJane.figureScript((AdapterToAdapter) driverManager.getCurrentDriver());
    }

}
