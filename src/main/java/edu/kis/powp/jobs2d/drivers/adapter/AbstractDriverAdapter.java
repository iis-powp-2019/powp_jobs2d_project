package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class AbstractDriverAdapter extends AbstractDriver {

    private int startX, startY;

    public AbstractDriverAdapter() {
        super(0, 0);
    }

    @Override public void operateTo(int x, int y) {
        ILine line = LineFactory.getBasicLine();
        line.setStartCoordinates(this.getX(), this.getY());
        line.setEndCoordinates(x, y);

        DrawerFeature.getDrawerController().drawLine(line);
        setPosition(x,y);
    }
}