package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class LineWithExtendedFunctionality extends AbstractLine implements ILine {


    public LineWithExtendedFunctionality()
    {
        super();
        color = Color.BLACK;
        thickness = 3.0f;
        dotted = false;
    }

    public LineWithExtendedFunctionality(Color color, float thickness, boolean dotted)
    {
        super();
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    }

    public LineWithExtendedFunctionality(ILine line)
    {
        super();
        color = line.getColor();
        thickness = line.getThickness();
        dotted = line.isDotted();
    }

    public void setThickness(float thickness)
    {
        this.thickness = thickness;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public void setDotted(boolean dotted)
    {
        this.dotted = dotted;
    }
}
