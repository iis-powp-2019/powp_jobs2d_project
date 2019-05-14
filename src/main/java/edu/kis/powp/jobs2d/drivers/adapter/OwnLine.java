package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class OwnLine extends AbstractLine {
    public OwnLine(Color color, float thickness, boolean isDotted){
        super();
        this.color=color;
        this.dotted=isDotted;
        this.thickness=thickness;
    }

}
