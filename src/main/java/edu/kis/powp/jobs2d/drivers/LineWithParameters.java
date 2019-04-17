package edu.kis.powp.jobs2d.drivers;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class LineWithParameters extends AbstractLine implements ILine {

    public LineWithParameters()
    {
        super();
        color = LineFactory.getBasicLine().getColor();
        thickness = LineFactory.getBasicLine().getThickness();
        dotted = LineFactory.getBasicLine().isDotted();
    }

    public LineWithParameters(ILine line)
    {
        super();
        color = line.getColor();
        thickness = line.getThickness();
        dotted = line.isDotted();
    }

    public LineWithParameters(Color color, float thickness, boolean dotted)
    {
        super();
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    }

}
