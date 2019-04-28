package edu.kis.powp.jobs2d.drivers.adapter;

import java.awt.Color;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.factory.LineCustomizable;
import edu.kis.powp.jobs2d.features.DrawerFeature;

/**
 * driver adapter to drawer with several bugs.
 */
public class LineDrawerAdapter implements Job2dDriver {
    private int startX = 0, startY = 0;
    private ILine customizableLine;

    public LineDrawerAdapter(ILine line) {
    	super();
        customizableLine=LineFactory.getBasicLine();
        setCustomizableLine(Color.CYAN, 5, true);
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
        setPosition(x,y);
        DrawerFeature.getDrawerController().drawLine(customizableLine);
    }
    

    public void setCustomizableLine(Color color, float thick, boolean dot)
    {
        customizableLine=new LineCustomizable(color,thick,dot);
    }
}