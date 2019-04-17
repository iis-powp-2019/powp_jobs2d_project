package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.AbstractDriver;

public class AbstractDriverAdapter extends AbstractDriver {

    private int startingXPos = 0, startingYPos = 0;
    private DrawPanelController drawPanelController;

    public AbstractDriverAdapter(DrawPanelController drawPanelController) {
        super(0, 0);
        this.drawPanelController = drawPanelController;
    }

    @Override public void operateTo(int x, int y) {
        ILine line = LineFactory.getDottedLine();
        line.setStartCoordinates(startingXPos, startingYPos);
        line.setEndCoordinates(x, y);
        drawPanelController.drawLine(line);
        setPosition(x, y);
    }
}
