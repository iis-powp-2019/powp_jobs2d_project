package edu.kis.powp.jobs2d.drivers.adapter;


import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

import java.awt.*;

public class SpecialLineDrawerAdapter implements Job2dDriver {
    private int startX = 0, startY = 0;

    public SpecialLineDrawerAdapter() {
        super();
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        ILine line = new ParametrizedLineAdapter(LineFactory.getSpecialLine());
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

        setPosition(x, y);
        DrawerFeature.getDrawerController().drawLine(line);
    }

}
