package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.factory.LineCustomizable;
import edu.kis.powp.jobs2d.features.DrawerFeature;

import java.awt.*;

public class LineDrawerAdapter implements Job2dDriver {

    private int startX = 0, startY = 0;
    private ILine customizableLine;

    public LineDrawerAdapter() {
        super();
        customizableLine=LineFactory.getBasicLine();
    }
    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        customizableLine.setStartCoordinates(this.startX, this.startY);
        customizableLine.setEndCoordinates(x, y);

        DrawerFeature.getDrawerController().drawLine(customizableLine);
        setPosition(x,y);
    }
    public void setCustomizableLine(Color color, float thick, boolean dot){
        customizableLine=new LineCustomizable(color,thick,dot);
    }
}
