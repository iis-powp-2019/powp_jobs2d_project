package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureOptionListener4 implements ActionListener {

    private DriverManager driverManager;
    private ComplexCommand shape;

    public SelectTestFigureOptionListener4(DriverManager driverManager, ComplexCommand shape) {
        this.driverManager = driverManager;
        this.shape =  shape;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        shape.execute(driverManager.getCurrentDriver());
    }
}
