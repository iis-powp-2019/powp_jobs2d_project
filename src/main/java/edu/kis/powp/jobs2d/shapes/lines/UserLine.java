package edu.kis.powp.jobs2d.shapes.lines;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class UserLine extends AbstractLine {
    public UserLine(Color color, float thickness, boolean dotted){
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    }
}
