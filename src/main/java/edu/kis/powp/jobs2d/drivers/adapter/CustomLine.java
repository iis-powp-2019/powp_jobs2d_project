package edu.kis.powp.jobs2d.drivers.adapter;

import java.awt.Color;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

public class CustomLine extends AbstractLine {

	public CustomLine(Color color, double thickness, boolean dotted) {
		super();
		this.color = color;
		this.thickness = (float)thickness;
		this.dotted = dotted;
	}
	
}
