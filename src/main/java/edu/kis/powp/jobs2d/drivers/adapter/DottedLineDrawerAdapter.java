package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class DottedLineDrawerAdapter implements Job2dDriver  {

	private int startX = 0, startY = 0;
	
	DrawPanelController dPanel;
	
	public DottedLineDrawerAdapter(DrawPanelController dPanel) {
		super();
		this.dPanel = dPanel;
	}
	
	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		ILine line = LineFactory.getDottedLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		
		dPanel.drawLine(line);
		
		startX = x;
		startY = y;
	}

	@Override
	public String toString() {
		return "kreska przerywana";
	}
	
}
