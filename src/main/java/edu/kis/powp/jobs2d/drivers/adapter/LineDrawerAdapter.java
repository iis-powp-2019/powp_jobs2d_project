package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter implements Job2dDriver{

    public static final ILine dottedLine = LineFactory.getDottedLine();
    public static final ILine specialLine = LineFactory.getSpecialLine();
    public static final ILine basicLine = LineFactory.getBasicLine();


    protected int startX = 0, startY = 0;
    private ILine iLine;
    private DrawPanelController drawPanelController;

    public LineDrawerAdapter(ILine iLine, DrawPanelController drawPanelController) {
        this.drawPanelController = drawPanelController;
        this.iLine = iLine;
    }

    @Override
    public void operateTo(int x, int y) {
        iLine.setStartCoordinates(this.startX, this.startY);
        iLine.setEndCoordinates(x, y);

        drawPanelController.drawLine(iLine);
        setPosition(x,y);
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }
}
