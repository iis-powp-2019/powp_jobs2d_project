package edu.kis.powp.legacy.drawer;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.adapter.MyAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

/**
 * Drawer test.
 * 
 * @author Dominik
 */
public class TestDrawer {
	/**
	 * Drawer test.
	 */
	public static void main(String[] args) {
		Application app = new Application("Drawer App");
		MyAdapter controller = new MyAdapter(app);
		FiguresJoe.figureScript1(controller);
		app.setVisibility(true);
		
		
		/*DefaultDrawerFrame.getDefaultDrawerFrame().setVisible(true);
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(-100, -60);
		line.setEndCoordinates(60, 130);
		controller.drawLine(line);*/
	}
}
