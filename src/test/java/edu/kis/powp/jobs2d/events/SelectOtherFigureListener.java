package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.command.DriverCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectOtherFigureListener implements ActionListener {

    private DriverCommand command;

    public SelectOtherFigureListener(DriverCommand command) {
        this.command = command;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        command.execute();

    }


}
