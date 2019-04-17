package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.JaneFigureAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectJaneFigureOptionListener implements ActionListener {
    //    private DriverManager driverManager;
private JaneFigureAdapter janeFigureAdapter;
    public SelectJaneFigureOptionListener(DriverManager driverManager) {
        this.janeFigureAdapter = new JaneFigureAdapter(0, 0);
    }

    @Override public void actionPerformed(ActionEvent e) {
        FiguresJane.figureScript(janeFigureAdapter);
    }

}
