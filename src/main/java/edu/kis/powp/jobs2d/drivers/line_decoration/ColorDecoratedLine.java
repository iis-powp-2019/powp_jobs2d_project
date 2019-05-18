package edu.kis.powp.jobs2d.drivers.line_decoration;

import edu.kis.legacy.drawer.shape.ILine;

import java.awt.*;

public class ColorDecoratedLine extends DecoratedLine {

    private Color color;

    public ColorDecoratedLine(Color color, ILine line) {
        super(line);
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ILine clonnedLine = new ClonningLine(this.getColor(), super.getThickness(), super.isDotted(),
                super.getStartCoordinateX(), super.getEndCoordinateX(),
                super.getStartCoordinateY(), super.getEndCoordinateY());
        return clonnedLine.clone();
    }
}
