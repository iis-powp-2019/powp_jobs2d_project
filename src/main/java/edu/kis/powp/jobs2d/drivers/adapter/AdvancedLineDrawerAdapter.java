package edu.kis.powp.jobs2d.drivers.adapter;

import java.awt.Color;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class AdvancedLineDrawerAdapter implements Job2dDriver {

private int startX = 0, startY = 0;
	
	DrawPanelController dPanel;
	ILine line;
	
	public AdvancedLineDrawerAdapter(DrawPanelController dPanel) {
		super();
		this.dPanel = dPanel;
		line = LineFactory.getSpecialLine();
	}
	
	public AdvancedLineDrawerAdapter(DrawPanelController dPanel, Color color, double thickness, boolean dotted) {
		super();
		this.dPanel = dPanel;
		line = new CustomLine(color, thickness, dotted);
	}
	
	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		
		dPanel.drawLine(line);
		
		startX = x;
		startY = y;
	}

	@Override
	public String toString() {
		return "przerywana zaawansowana";
	}

}
