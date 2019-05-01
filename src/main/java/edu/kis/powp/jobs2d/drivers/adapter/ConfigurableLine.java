package edu.kis.powp.jobs2d.drivers.adapter;

import java.awt.Color;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

public class ConfigurableLine extends AbstractLine {
   public ConfigurableLine(Color color, float thickness, boolean dotted) {
        super();
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    } 
}