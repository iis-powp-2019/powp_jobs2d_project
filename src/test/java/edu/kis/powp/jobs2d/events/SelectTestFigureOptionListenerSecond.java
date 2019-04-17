package edu.kis.powp.jobs2d.events;

import java.awt.event.*;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListenerSecond implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionListenerSecond(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresJoe.figureScript2(driverManager.getCurrentDriver());
    }
}