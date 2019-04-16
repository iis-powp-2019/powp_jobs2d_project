package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.FigureJaneDriver;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectFiguresJaneOneOptionListener implements ActionListener {
    private FigureJaneDriver driver = new FigureJaneDriver(0, 0);

    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresJane.figureScript(driver);
    }
}
