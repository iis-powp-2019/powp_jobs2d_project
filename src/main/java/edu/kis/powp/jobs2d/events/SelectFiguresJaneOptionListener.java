package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.adapter.AbstractDriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectFiguresJaneOptionListener implements ActionListener {

    private AbstractDriverAdapter driver = new AbstractDriverAdapter(0, 0);

    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresJane.figureScript(driver);
    }

}
