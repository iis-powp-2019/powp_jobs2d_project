package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.CurrentDriverWrapper;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestJaneFigureOptionListener implements ActionListener {

	private CurrentDriverWrapper wrapper = new CurrentDriverWrapper(0, 0);

	@Override
	public void actionPerformed(ActionEvent e) {
		FiguresJane.figureScript(wrapper);
	}
}
