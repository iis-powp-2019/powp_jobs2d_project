package edu.kis.powp.jobs2d;

import java.awt.Color;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

public class MyILine extends AbstractLine {

    public MyILine(Color color, float thickness, boolean dotted) {
        super();
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    }
}
