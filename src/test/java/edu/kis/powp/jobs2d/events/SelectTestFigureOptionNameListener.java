package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.kis.powp.jobs2d.command.Factory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestFigureOptionNameListener implements ActionListener{


    private DriverManager driverManager;
    int i;

    public SelectTestFigureOptionNameListener(DriverManager driverManager, int i) {
        this.driverManager = driverManager;
        this.i=i;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(i==1)
            Factory.triangleFactory(driverManager.getCurrentDriver()).execute();
        else
            Factory.rectangleFactory(driverManager.getCurrentDriver()).execute();

    }

}
