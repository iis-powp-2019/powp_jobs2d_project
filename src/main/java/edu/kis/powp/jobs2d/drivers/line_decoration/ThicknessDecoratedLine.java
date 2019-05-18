package edu.kis.powp.jobs2d.drivers.line_decoration;

import edu.kis.legacy.drawer.shape.ILine;

public class ThicknessDecoratedLine extends DecoratedLine {

    private float thickness;

    public ThicknessDecoratedLine(float thickness, ILine line) {
        super(line);
        this.thickness = thickness;
    }

    @Override
    public float getThickness() {
        return this.thickness;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ILine clonnedLine = new ClonningLine(super.getColor(), this.getThickness(), super.isDotted(),
                super.getStartCoordinateX(), super.getEndCoordinateX(),
                super.getStartCoordinateY(), super.getEndCoordinateY());
        return clonnedLine.clone();
    }
}
