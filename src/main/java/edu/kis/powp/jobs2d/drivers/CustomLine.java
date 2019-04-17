package edu.kis.powp.jobs2d.drivers;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class CustomLine extends AbstractLine {

    public CustomLine() {
        super();
        this.color = Color.BLACK;
        this.thickness = 3.0f;
        this.dotted = false;
    }

    public CustomLine(ILine line) {
        super();
        this.color = line.getColor();
        this.thickness = line.getThickness();
        this.dotted = line.isDotted();
    }

    public CustomLine(Color color, float thickness, boolean dotted) {
        super();
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public void setThickness(float thickness)
    {
        this.thickness = thickness;
    }

    public void setDotted(boolean dotted)
    {
        this.dotted = dotted;
    }
}
