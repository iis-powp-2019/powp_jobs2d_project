package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;

import java.awt.*;

public class ParametrizedLineAdapter implements IParametrizedLine {

    private ILine line;
    private float thickness;
    private Color color;

    public ParametrizedLineAdapter(ILine line) {
        this.line = line;
        this.thickness = line.getThickness();
        this.color = line.getColor();
    }

    @Override
    public float getThickness() {
        return thickness;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public Color getColor() {
        return color;
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
        line.setEndCoordinates(i, i1);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

}
