package edu.kis.powp.jobs2d.drivers.line_decoration;

import edu.kis.legacy.drawer.shape.ILine;

import java.awt.Color;

public abstract class DecoratedLine extends WrappedLine {

    public DecoratedLine(ILine line) {
        super(line);
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    @Override
    public float getThickness() {
        return super.getThickness();
    }

    @Override
    public boolean isDotted() {
        return super.isDotted();
    }


}
