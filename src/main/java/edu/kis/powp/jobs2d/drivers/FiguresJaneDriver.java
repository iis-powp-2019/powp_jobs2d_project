package edu.kis.powp.jobs2d.drivers;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class FiguresJaneDriver extends AbstractDriver{
	private ILine line;
	
	public FiguresJaneDriver(int _x, int _y, ILine _line) {
		super(_x, _y);
		this.line = _line;
	}


	@Override
	public void operateTo(int _x, int _y) {
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.getX(), this.getY());
		line.setEndCoordinates(_x, _y);
		this.setPosition(_x, _y);
		
		DrawerFeature.getDrawerController().drawLine(line);
	}

	@Override
	public String toString() {
		return "@FJ!$!@$!#@$(*#@&Q(%^*#@";
	}

}
