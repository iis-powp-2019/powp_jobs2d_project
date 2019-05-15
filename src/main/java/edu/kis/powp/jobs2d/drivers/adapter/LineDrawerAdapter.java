package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter implements Job2dDriver{
	private DrawPanelController controller;
	private int startX = 0, startY = 0;
	private ILine line;
	public LineDrawerAdapter(DrawPanelController drawControler,ILine line) {
		super();
		this.controller = drawControler;
		this.line = line;
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
		setPosition(x,y);
		controller.drawLine(line);
		
	}

	@Override
	public String toString() {
		return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}

	public ILine getLine() {
		return line;
	}

	public void setLine(ILine line) {
		this.line = line;
	}
}
