package edu.kis.powp.jobs2d;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class FiguresJaneDriver extends AbstractDriver {
	private ILine line;

	public FiguresJaneDriver(int x, int y, ILine line) {
		super(x, y);
		this.line = line;
	}

	@Override
	public void operateTo(int x, int y) {
		line.setStartCoordinates(this.getX(), this.getY());
		line.setEndCoordinates(x, y);
		DrawerFeature.getDrawerController().drawLine(line);
		setPosition(x, y);
	}

	@Override
	public String toString() {
		return "@Q!$!FiguresJaneDriver@&Q(%^*#@";
	}
}