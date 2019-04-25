package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestFigureOptionListener3 implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionListener3(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand complex = new ComplexCommand();
        complex.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(), 0, 0));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 45, -45));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, -90));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), -45, -45));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, 0));
        complex.execute();
    }
}
