package edu.kis.powp.jobs2d;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.Color;

public class LineWithParameters extends AbstractLine {
    public LineWithParameters(Color hue, float size, boolean isDotted){
        super();
        this.color = hue;
        this.thickness = size;
        this.dotted = isDotted;
    }
}
