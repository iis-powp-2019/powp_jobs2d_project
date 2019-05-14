package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter
	extends DrawPanelController implements Job2dDriver
{
	public enum LineType
	{
		basic,
		dotted,
		special
	}
	
	private int startX = 0, startY = 0;
	private LineType type;
	
	public LineDrawerAdapter(LineType type)
	{
		super();
		this.type = type;
	}
	
	@Override
	public String toString()
	{
		return "Line Drawer Adapter, type: " + type;
	}
	
	@Override
	public void setPosition(int x, int y)
	{
		this.startX = x;
		this.startY = y;
	}
	
	@Override
	public void operateTo(int x, int y)
	{
		ILine line = null;
		switch(type)
		{
		case basic:
			line = LineFactory.getBasicLine();
			break;
		case dotted:
			line = LineFactory.getDottedLine();
			break;
		case special:
			line = LineFactory.getSpecialLine();
			break;
			
		}
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		
		setPosition(line.getEndCoordinateX(), line.getEndCoordinateY());
		
		DrawerFeature.getDrawerController().drawLine(line);
	}
}
