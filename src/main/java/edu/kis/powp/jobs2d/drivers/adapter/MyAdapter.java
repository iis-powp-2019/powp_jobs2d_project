package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

/**
 * driver adapter to drawer with several bugs.
 */
public class MyAdapter extends DrawPanelController implements Job2dDriver {
	private int startX = 0, startY = 0;

	public MyAdapter() {
		super();
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		//DrawPanelController drawerController = DrawerFeature.getDrawerController();
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

		//drawerController.drawLine(line);
		drawLine(line);
		setPosition(x, y);
	}

	@Override
	public String toString() {
		return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}

// TODO: Uzyć zasad SOLID do poprawy jakości kodu, getDrawerController() w DrawerFeature
// TODO: aby wyłaczyć wolne okno setupDefaultDrawerVisibilityManagement(app)