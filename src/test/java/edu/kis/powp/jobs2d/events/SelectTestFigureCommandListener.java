package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.DriverCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureCommandListener implements ActionListener {

    private DriverCommand command;

    public SelectTestFigureCommandListener(DriverCommand command) {
        this.command = command;
    }

    @Override public void actionPerformed(ActionEvent e) {
        command.execute();
    }
}
