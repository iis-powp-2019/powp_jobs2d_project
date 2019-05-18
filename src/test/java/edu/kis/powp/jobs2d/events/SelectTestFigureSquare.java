package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.Command.CommandFactory;
import edu.kis.powp.jobs2d.drivers.Command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.Command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.Command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureSquare implements ActionListener {
    private DriverManager driverManager;

    public SelectTestFigureSquare(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand drawSquare = CommandFactory.square(100,driverManager.getCurrentDriver());
        drawSquare.execute();
    }
}