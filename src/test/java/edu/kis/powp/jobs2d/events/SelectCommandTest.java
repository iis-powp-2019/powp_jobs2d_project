package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.drivers.CommandTest;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectCommandTest implements ActionListener
{
    private DriverManager driverManager;

    public SelectCommandTest(DriverManager driverManager)
    {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CommandTest.figureScript(driverManager.getCurrentDriver());
    }
}
