package edu.kis.powp.jobs2d.drivers.line_decoration;

import edu.kis.legacy.drawer.shape.ILine;

public class DottedDecoratedLine extends DecoratedLine {

    private boolean dotted;

    public DottedDecoratedLine(boolean dotted, ILine line) {
        super(line);
        this.dotted = dotted;
    }

    @Override
    public boolean isDotted() {
        return this.dotted;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ILine clonnedLine = new ClonningLine(super.getColor(), super.getThickness(), this.isDotted(),
                super.getStartCoordinateX(), super.getEndCoordinateX(),
                super.getStartCoordinateY(), super.getEndCoordinateY());
        return clonnedLine.clone();
    }
}
