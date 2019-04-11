package edu.kis.powp.jobs2d.drivers.adapter;

import java.awt.Color;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

public class LineParameterized extends AbstractLine {
	public LineParameterized(Color color, Float thickness, Boolean dotted) {
		super();
		this.color = color;
		this.thickness = thickness;
		this.dotted = dotted;
	}
}
