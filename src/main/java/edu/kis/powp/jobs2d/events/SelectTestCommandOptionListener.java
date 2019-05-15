package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestCommandOptionListener implements ActionListener {

    private DriverManager driverManager;
    private ComplexCommandFactory complexCommandFactory = new ComplexCommandFactory();
    int option;

    public SelectTestCommandOptionListener(DriverManager driverManager, int i) {
        this.driverManager = driverManager;
        option=i;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (option==1)
            complexCommandFactory.draw1(driverManager.getCurrentDriver()).execute();
        else if(option==2)
            complexCommandFactory.draw2(driverManager.getCurrentDriver()).execute();
    }
}