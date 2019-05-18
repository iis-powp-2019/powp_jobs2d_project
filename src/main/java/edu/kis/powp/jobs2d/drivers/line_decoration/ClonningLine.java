package edu.kis.powp.jobs2d.drivers.line_decoration;

import edu.kis.legacy.drawer.shape.ILine;

import java.awt.Color;

public class ClonningLine implements ILine {

    private Color color;
    private float thickness;
    private boolean dotted;
    private int startX;
    private int endX;
    private int startY;
    private int endY;


    public ClonningLine(Color color, float thickness, boolean dotted,
                        int startX, int endX, int startY, int endY) {
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public float getThickness() {
        return thickness;
    }

    @Override
    public boolean isDotted() {
        return dotted;
    }

    @Override
    public int getStartCoordinateX() {
        return startX;
    }

    @Override
    public int getEndCoordinateX() {
        return endX;
    }

    @Override
    public int getStartCoordinateY() {
        return startY;
    }

    @Override
    public int getEndCoordinateY() {
        return endY;
    }

    @Override
    public void setStartCoordinates(final int x, final int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void setEndCoordinates(final int x, final int y) {
        this.endX = x;
        this.endY = y;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
