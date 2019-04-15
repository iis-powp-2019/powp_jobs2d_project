package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

/**
 * driver adapter to drawer with several bugs.
 */
public class Job2d2DrawerAdapter extends DrawPanelController implements Job2dDriver {

	public enum LineStyle
	{
		BASIC, DOTTED, SPECIAL;
	}

	private int startX = 0, startY = 0;
	private ILine line = LineFactory.getBasicLine();
	private LineStyle currentLineStyle = LineStyle.BASIC;

	public Job2d2DrawerAdapter() {
		super();
	}

	public void setLineStyle(LineStyle style) {

		if(currentLineStyle != style)
		{
			currentLineStyle = style;

			switch(style)
			{
				case BASIC:
					line = LineFactory.getBasicLine();
					break;

				case DOTTED:
					line = LineFactory.getDottedLine();
					break;

				case SPECIAL:
					line = LineFactory.getSpecialLine();
					break;
			}

			//DrawPanelController drawerController = DrawerFeature.getDrawerController();
			//drawerController.getDrawArea().repaint(); private :(
		}
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		DrawPanelController drawerController = DrawerFeature.getDrawerController();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

		drawerController.drawLine(line);
		setPosition(x, y);
	}

	@Override
	public String toString() {
		return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}

// TODO: Uzyć zasad SOLID do poprawy jakości kodu
