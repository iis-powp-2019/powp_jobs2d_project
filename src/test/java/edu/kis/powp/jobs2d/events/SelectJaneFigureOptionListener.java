package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.JaneFigureDriver;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectJaneFigureOptionListener  implements ActionListener {

    private JaneFigureDriver driver;

    public SelectJaneFigureOptionListener() {
        this.driver  = new JaneFigureDriver(0, 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresJane.figureScript(driver);
    }
}
