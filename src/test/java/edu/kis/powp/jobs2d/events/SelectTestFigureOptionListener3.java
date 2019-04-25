package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestFigureOptionListener3 implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionListener3(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, 100));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 200, 100));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 200, 0));
        complexCommand.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 0, 0));

        complexCommand.execute();
    }
}
