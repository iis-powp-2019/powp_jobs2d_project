package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class AbstractDriverAdapter extends AbstractDriver {
    private ILine line;

    public AbstractDriverAdapter(int x, int y, ILine line) {
        super(x, y);
        this.line = line;
    }

    @Override public void operateTo(int i, int i1) {
        ILine line = LineFactory.getBasicLine();
        line.setStartCoordinates(this.getX(), this.getY());
        line.setEndCoordinates(i, i1);

        DrawerFeature.getDrawerController().drawLine(line);
        setPosition(i,i1);
        DrawerFeature.getDrawerController().drawLine(line);
    }

    @Override public String toString() {
        return "AbstractDriverAdapter{" + "line=" + line + '}';
    }
}
