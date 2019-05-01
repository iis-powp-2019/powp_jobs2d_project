package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.FigureFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestFigureOptionListener3 implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionListener3(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ComplexCommand complex = new ComplexCommand();
        FigureFactory.getCircle(driverManager)
                     .execute();

    }
}
