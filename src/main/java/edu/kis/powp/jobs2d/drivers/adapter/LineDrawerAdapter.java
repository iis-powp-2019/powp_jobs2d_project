package edu.kis.powp.jobs2d.drivers.adapter;

import java.awt.Color;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter extends Adapter implements Job2dDriver {

	private int startX = 0, startY = 0;
	private ILine lineParameterized;

	public LineDrawerAdapter() {
		super();
		lineParameterized = LineFactory.getBasicLine();
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		lineParameterized.setStartCoordinates(this.startX, this.startY);
		lineParameterized.setEndCoordinates(x, y);

		DrawerFeature.getDrawerController().drawLine(lineParameterized);
		setPosition(x, y);
	}

	public void setLineParameterized(Color color, float thickness, boolean dotted) {
		lineParameterized = new LineParameterized(color, thickness, dotted);
	}
}
