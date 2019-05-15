package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.CommandTest;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectRectangle implements ActionListener
{
    private DriverManager driverManager;

    public SelectRectangle(DriverManager driverManager)
    {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CommandTest.rect(driverManager.getCurrentDriver());
    }
}
