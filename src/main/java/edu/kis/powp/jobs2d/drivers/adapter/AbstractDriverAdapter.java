package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class AbstractDriverAdapter extends AbstractDriver {

    public AbstractDriverAdapter(int x, int y) {
        super(x, y);
    }

    @Override public void operateTo(int i, int i1) {
        ILine line = LineFactory.getBasicLine();
        line.setStartCoordinates(this.getX(), this.getY());
        line.setEndCoordinates(i, i1);

        DrawerFeature.getDrawerController().drawLine(line);
        setPosition(i,i1);
    }
}
