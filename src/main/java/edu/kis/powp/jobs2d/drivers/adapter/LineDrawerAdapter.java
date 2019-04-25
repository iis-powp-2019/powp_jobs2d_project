package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter implements Job2dDriver
{
    private ILine line = LineFactory.getBasicLine();
    private int startX = 0, startY = 0;

    public LineDrawerAdapter() {
        super();
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;

    }

    public void setLine(int lineType)
    {
        if(lineType == 0)
        {
            line = LineFactory.getBasicLine();
        }
        else if(lineType == 1)
        {
            line = LineFactory.getDottedLine();
        }
        else if(lineType == 2)
        {
            line = LineFactory.getSpecialLine();
        }
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

        this.startX = line.getEndCoordinateX();
        this.startY = line.getEndCoordinateY();

        DrawerFeature.getDrawerController().drawLine(line);
    }

    @Override
    public String toString() {
        return "@Q!$!@$!#@$(*#@&Q(%^*#@";
    }
}
