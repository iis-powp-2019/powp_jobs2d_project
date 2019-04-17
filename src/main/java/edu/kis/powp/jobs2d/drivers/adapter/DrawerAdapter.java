package edu.kis.powp.jobs2d.drivers.adapter;

import com.google.inject.Inject;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

import javax.sound.sampled.Line;

/**
 * driver adapter to drawer with several bugs.
 */
public class DrawerAdapter implements Job2dDriver {
	private int startX = 0, startY = 0;
	private ILine line;

	@Inject
	DrawerFeature drawerFeature;


	public DrawerAdapter() {
		super();
	}

	public void choose_line(int choose)
	{
		if(choose==1) line = LineFactory.getBasicLine();
		else if(choose==2) line = LineFactory.getDottedLine();
		else if(choose==3) line = LineFactory.getSpecialLine();
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		//ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

		drawerFeature.getDrawerController().drawLine(line);
		setPosition(x,y);

	}

	@Override
	public String toString() {
		return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}
