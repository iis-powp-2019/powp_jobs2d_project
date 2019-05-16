package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter extends DrawPanelControllerAdapter {

    public static final ILine dottedLine = LineFactory.getDottedLine();
    public static final ILine specialLine = LineFactory.getSpecialLine();
    public static final ILine basicLine = LineFactory.getBasicLine();

    private ILine iLine;

    public LineDrawerAdapter(ILine iLine) {
        this.iLine = iLine;
    }

    @Override
    public void operateTo(int x, int y) {
        iLine.setStartCoordinates(this.startX, this.startY);
        iLine.setEndCoordinates(x, y);

        DrawerFeature.getDrawerController().drawLine(iLine);
        setPosition(x,y);
    }
}
