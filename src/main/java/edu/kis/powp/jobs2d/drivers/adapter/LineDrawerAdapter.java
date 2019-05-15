package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

/**
 * driver adapter to drawer with several bugs.
 */
public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver {
	private int startX = 0, startY = 0;
	private ILine line;

	/**
	 * @param line drawer will use specified by you line
	 */
	public LineDrawerAdapter(ILine line) {
		super();
		this.line = line;
	}

	/**
	 * Changes the head coordinates (in passive mode).
	 *
	 * @param x new position on the X axis.
	 * @param y new position on the Y axis.
	 */
	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	/**
	 * Moves the head (in active mode) to the given coordinates.
	 *
	 * @param x end of the line in X axis.
	 * @param y end of the line in Y axis.
	 */
	@Override
	public void operateTo(int x, int y) {
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

		this.startX = x;
		this.startY = y;

		DrawerFeature.getDrawerController().drawLine(line);
	}

	@Override
	public String toString() {
		return "LineDrawerAdapter";
	}
}
