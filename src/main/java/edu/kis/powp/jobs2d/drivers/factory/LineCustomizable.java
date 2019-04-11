package edu.kis.powp.jobs2d.drivers.factory;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class LineCustomizable extends AbstractLine {
    public LineCustomizable(Color color, Float thickness, Boolean dotted) {
        super();
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    }
}
