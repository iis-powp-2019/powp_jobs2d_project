package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.AbstractDriver;

public class AbstractDriverAdapter extends AbstractDriver {

    private int startX = 0;
    private int startY = 0;
    private DrawPanelController drawPanelController;
    private ILine line;

    public AbstractDriverAdapter(int x, int y, DrawPanelController drawPanelController, ILine line) {
        super(x, y);
        this.drawPanelController = drawPanelController;
        this.line = line;
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        setPosition(x, y);

        drawPanelController.drawLine(line);
    }

    @Override
    public String toString() {
        return "AbstractDriverAdapter";
    }
}
