package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectDriverMenuOptionListnerForSecondExample implements ActionListener {
    private DriverManager driverManager;

    public SelectDriverMenuOptionListnerForSecondExample( DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresJoe.figureScript2(driverManager.getCurrentDriver());
    }
}
