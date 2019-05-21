package edu.kis.powp.jobs2d.events;
import edu.kis.powp.jobs2d.drivers.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.ShapeFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawCircle implements ActionListener {

    private DriverManager dManager;

    public DrawCircle(DriverManager driverManager) {
        this.dManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ShapeFactory factory = new ShapeFactory(dManager.getCurrentDriver());
        ComplexCommand complexCommand = (ComplexCommand) factory.createCircle(0, 0, 100);
        complexCommand.execute();
    }
}  
