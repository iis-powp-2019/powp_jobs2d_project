package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestFigureOptionListener3 implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionListener3(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ComplexCommand complex = new ComplexCommand();
        complex.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(), 4, 5));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 2, 50));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 1, 7));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 4, 5));

        complex.execute();

    }
}
