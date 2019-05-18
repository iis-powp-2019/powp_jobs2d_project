package edu.kis.powp.jobs2d.drivers.line_decoration;

import edu.kis.legacy.drawer.shape.ILine;

import java.awt.Color;

public abstract class WrappedLine implements ILine {
    private ILine line;

    public WrappedLine(ILine line) {
        this.line = line;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return line.clone();
    }

    @Override
    public Color getColor() {
        return line.getColor();
    }

    @Override
    public float getThickness() {
        return line.getThickness();
    }

    @Override
    public boolean isDotted() {
        return line.isDotted();
    }

    @Override
    public int getStartCoordinateX() {
        return line.getStartCoordinateX();
    }

    @Override
    public int getEndCoordinateX() {
        return line.getEndCoordinateX();
    }

    @Override
    public int getStartCoordinateY() {
        return line.getStartCoordinateY();
    }

    @Override
    public int getEndCoordinateY() {
        return line.getEndCoordinateY();
    }

    @Override
    public void setStartCoordinates(int i, int i1) {
        line.setStartCoordinates(i, i1);
    }

    @Override
    public void setEndCoordinates(int i, int i1) {
        line.setEndCoordinates(i,i1);
    }
}
