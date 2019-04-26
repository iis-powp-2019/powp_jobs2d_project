package edu.kis.powp.jobs2d.events;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.drivers.adapter.Job2dDriverAdapter;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;
import edu.kis.powp.jobs2d.features.DrawerFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CommandFigure implements ActionListener {

    private ArrayList<DriverCommand> commands;
    private ComplexCommand complexCommand;
    private Job2dDriverAdapter job2dDriverAdapter;

    public CommandFigure() {
        commands = new ArrayList<>();
        complexCommand = new ComplexCommand();
        ILine line = LineFactory.getBasicLine();
        job2dDriverAdapter = new Job2dDriverAdapter(line, DrawerFeature.getDrawerController());
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        commandFigure();
    }

    private void commandFigure() {
        commands.add(new SetPositionCommand(job2dDriverAdapter, 20, 20));
        commands.add(new OperateToCommand(job2dDriverAdapter, 10, 10));
        complexCommand = new ComplexCommand(commands);
        complexCommand.add(new OperateToCommand(job2dDriverAdapter, 20, 0));
        complexCommand.add(new OperateToCommand(job2dDriverAdapter, 10, -10));
        complexCommand.execute();
    }

}
