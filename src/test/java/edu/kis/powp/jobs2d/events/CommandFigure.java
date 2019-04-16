package edu.kis.powp.jobs2d.events;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommandFigure implements ActionListener {

    private DriverManager driverManager;

    public CommandFigure() {
        //this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        commandFigure();
    }

    private ILine line = LineFactory.getBasicLine();
    private LineDrawerAdapter lineDrawerAdapter = new LineDrawerAdapter(line);

    public void commandFigure() {
        SetPositionCommand setPositionCommand = new SetPositionCommand(lineDrawerAdapter, -120, -120);
        setPositionCommand.execute();

        OperateToCommand operateToCommand = new OperateToCommand(lineDrawerAdapter, 120, -120);
        operateToCommand.execute();
    }

}
