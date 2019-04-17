package edu.kis.powp.jobs2d;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class ConfigurableLine extends AbstractLine {

    public ConfigurableLine(Color color, float thickness, boolean isDotted) {
        super();
        this.color = color;
        this.thickness = thickness;
        this.dotted = isDotted;
    }


}
