package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.adapter.AbstractAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectJaneTestFigureOptionListener implements ActionListener {

    private AbstractAdapter abstractAdapter;

    public SelectJaneTestFigureOptionListener(AbstractAdapter abstractAdapter) {
        this.abstractAdapter = abstractAdapter;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresJane.figureScript(abstractAdapter);
    }
}
