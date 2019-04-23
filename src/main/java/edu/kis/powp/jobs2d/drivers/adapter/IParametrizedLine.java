package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;

import java.awt.*;

public interface IParametrizedLine extends ILine {
    void setThickness(float thickness);
    void setColor(Color color);
}
