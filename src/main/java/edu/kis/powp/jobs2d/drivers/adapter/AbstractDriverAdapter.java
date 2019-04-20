package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.AbstractDriver;

public class AbstractDriverAdapter extends AbstractDriver {

    private int startX = 0;
    private int startY = 0;
    private DrawPanelController drawPanelController;

    public AbstractDriverAdapter(DrawPanelController drawPanelController) {
        super(0, 0);
        this.drawPanelController = drawPanelController;
    }

    @Override
    public void operateTo(int x, int y) {
        ILine line = LineFactory.getDottedLine();
        line.setStartCoordinates(startX, startY);
        line.setEndCoordinates(x, y);

        drawPanelController.drawLine(line);

        setPosition(x, y);
    }

    @Override
    public String toString() {
        return "Abstract Driver Adapter";
    }
}
