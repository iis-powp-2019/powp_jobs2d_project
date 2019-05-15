package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;

/**
 * driver adapter to drawer with several bugs.
 */
public class AbstractDriverAdapter extends AbstractDriver {
//	private int x = 0, y = 0;

	public AbstractDriverAdapter() {
		super(0, 0);
	}


	/**
	 * Moves the head (in active mode) to the given coordinates.
	 *
	 * @param x end of the line in X axis.
	 * @param y end of the line in Y axis.
	 */
	@Override
	public void operateTo(int x, int y) {
		ILine line = LineFactory.getBasicLine();

		line.setStartCoordinates(this.getX(), this.getY());
		line.setEndCoordinates(x, y);

		this.setPosition(x, y);

		DrawerFeature.getDrawerController().drawLine(line);
	}

	@Override
	public String toString() {
		return "AbstractDriverAdapter";
	}
}
