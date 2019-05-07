package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver {

    private int startX = 0, startY = 0;
    private ILine iLine;

    public LineDrawerAdapter(ILine iLine) {
        super();
        this.iLine = iLine;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        this.iLine.setStartCoordinates(this.startX, this.startY);
        this.iLine.setEndCoordinates(x, y);
        setPosition(x, y);
        DrawerFeature.getDrawerController()
                     .drawLine(this.iLine);
    }

    @Override
    public String toString() {
        return "@Q!$!@$!#@$(*#@&Q(%^*#@";
    }

}
