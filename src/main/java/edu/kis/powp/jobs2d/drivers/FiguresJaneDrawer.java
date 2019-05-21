package edu.kis.powp.jobs2d.drivers;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class FiguresJaneDrawer extends AbstractDriver {

	public FiguresJaneDrawer(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operateTo(int x, int y) {
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.getX(), this.getY());
		line.setEndCoordinates(x, y);
		this.setPosition(x, y);

		DrawerFeature.getDrawerController().drawLine(line);
	}

}
