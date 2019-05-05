package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver {

    int startX = 0;
    int startY = 0;
    private ILine line;

    public LineDrawerAdapter() {
        super();
        this.line = LineFactory.getBasicLine();
    }
    public LineDrawerAdapter(ILine line) {
        super();
        this.line = line;
    }
    public void setLine(ILine line) {
        this.line = line;
    }

    @Override public void setPosition(int i, int i1) {
        this.startX = i;
        this.startY = i1;
    }

    @Override public void operateTo(int i, int i1) {
        ILine line = LineFactory.getSpecialLine();
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(i, i1);
        setPosition(i, i1);
        DrawerFeature.getDrawerController().drawLine(line);
    }

    @Override public String toString() {
        return "LineDrawerAdapter{" + "startX=" + startX + ", startY=" + startY + ", line=" + line + '}';
    }
}
