package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.ShapeFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureOptionListener4 implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionListener4(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ShapeFactory factory = new ShapeFactory(driverManager.getCurrentDriver());
        DriverCommand complexCommand = factory.drawCircle(0,0,180,360);
        complexCommand.execute();
    }
}
