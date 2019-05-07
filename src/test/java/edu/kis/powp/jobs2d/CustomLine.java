package edu.kis.powp.jobs2d;

import java.awt.Color;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

public class CustomLine extends AbstractLine {

    public CustomLine(Color _color, boolean _dotted, float _thickness) {
        super();
        this.color = _color;
        this.dotted = _dotted;
        this.thickness = _thickness;
    }
}
