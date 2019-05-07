package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.AbstractDriver;

public class AbstractDriverAdapter extends AbstractDriver
{
    private DrawPanelController drawer;

    public AbstractDriverAdapter(DrawPanelController drawerController)
    {
        super(0, 0);
        drawer = drawerController;
    }

    @Override
    public void operateTo(int x, int y)
    {
        ILine line = LineFactory.getBasicLine();
        line.setStartCoordinates(this.getX(), this.getY());
        line.setEndCoordinates(x, y);
        setPosition(x, y);
        drawer.drawLine(line);
    }
}
