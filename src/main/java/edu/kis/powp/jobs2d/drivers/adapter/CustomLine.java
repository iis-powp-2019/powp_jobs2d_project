package edu.kis.powp.jobs2d.drivers.adapter;

import java.awt.Color;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

public class CustomLine extends AbstractLine{
	public CustomLine(Color color, float thickness, boolean dotted) {
        super();
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    }
	public void setDotted(boolean dotted) {
		this.dotted=dotted;
	}
	
	public void setColor(Color color) {
		this.color=color;
	}
	public void setThickness(float thickness) {
		this.thickness=thickness;
	}
	
	
}
