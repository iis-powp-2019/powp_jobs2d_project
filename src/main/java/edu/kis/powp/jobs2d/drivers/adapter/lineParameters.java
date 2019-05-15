package edu.kis.powp.jobs2d.drivers.adapter;

import java.awt.Color;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.line.AbstractLine;

public class lineParameters extends AbstractLine implements ILine{
	public void setColor(Color color){	this.color = color;	}
    public void setThickness(float thickness){	this.thickness = thickness;	}
    public void setDotted(boolean dotted){	this.dotted = dotted;	}
    
	public lineParameters() {
		super();
		color = Color.black;
		thickness = 3.0f;
		dotted = false;
	}
	
	public lineParameters(Color color,float thickness,boolean dotted) {
		super();
		this.color = Color.black;
		this.thickness = 3.0f;
		this.dotted = false;
	}
	
	public lineParameters(ILine line) {
        super();
        this.color = line.getColor();
        this.thickness = line.getThickness();
        this.dotted = line.isDotted();
    }
	
}
