package edu.kis.powp.jobs2d.drivers.factory;

import edu.kis.legacy.drawer.shape.ILine;

import java.awt.*;

public interface IEnhancedLine extends ILine {
    public void setThickness(float thickness);
    public void setColor(Color color);
}
