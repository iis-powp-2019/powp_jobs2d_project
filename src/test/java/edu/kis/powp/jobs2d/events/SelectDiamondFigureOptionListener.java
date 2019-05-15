package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.FiguresFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectDiamondFigureOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectDiamondFigureOptionListener(DriverManager driverManager) {
    this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) { FiguresFactory.diamondFigure(driverManager.getCurrentDriver());
    }
}
