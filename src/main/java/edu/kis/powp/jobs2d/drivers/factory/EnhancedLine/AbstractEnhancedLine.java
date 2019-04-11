package edu.kis.powp.jobs2d.drivers.factory.EnhancedLine;

import edu.kis.legacy.drawer.shape.line.AbstractLine;
import edu.kis.powp.jobs2d.drivers.factory.IEnhancedLine;

import java.awt.*;

public class AbstractEnhancedLine extends AbstractLine implements IEnhancedLine {
    @Override
    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
