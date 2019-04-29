package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommandTest implements ActionListener {
    private Job2dDriver complexCommand;

    public CommandTest(Job2dDriver complexCommand) {
        this.complexCommand = complexCommand;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
