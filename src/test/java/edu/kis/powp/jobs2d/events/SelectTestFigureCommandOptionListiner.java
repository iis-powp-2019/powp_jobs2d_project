package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.Command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.Command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureCommandOptionListiner implements ActionListener {
    private DriverManager driverManager;

    public SelectTestFigureCommandOptionListiner(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        OperateToCommand operateToCommand = new OperateToCommand(233,-23, driverManager.getCurrentDriver());
        SetPositionCommand setPositionCommand = new SetPositionCommand(0,0, driverManager.getCurrentDriver());
        setPositionCommand.execute();
        operateToCommand.execute();
    }
}