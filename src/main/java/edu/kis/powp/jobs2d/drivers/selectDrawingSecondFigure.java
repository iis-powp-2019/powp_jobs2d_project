package edu.kis.powp.jobs2d.drivers;



import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class selectDrawingSecondFigure implements ActionListener {
    private DriverManager driverManager;

    public selectDrawingSecondFigure(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresJoe.figureScript2(driverManager.getCurrentDriver());
    }
}