package edu.kis.powp.jobs2d.events;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.drivers.adapter.Job2dDriverAdapter;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;
import edu.kis.powp.jobs2d.features.DrawerFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleFigure implements ActionListener {

    private ComplexCommand complexCommand;
    private Job2dDriverAdapter job2dDriverAdapter;

    public RectangleFigure() {
        complexCommand = new ComplexCommand();
        ILine line = LineFactory.getBasicLine();
        job2dDriverAdapter = new Job2dDriverAdapter(line, DrawerFeature.getDrawerController());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        commandFigure();
    }

    public void commandFigure() {
        complexCommand.add(new SetPositionCommand(job2dDriverAdapter, 100, 20));
        complexCommand.add(new OperateToCommand(job2dDriverAdapter, 100, -20));
        complexCommand.add(new OperateToCommand(job2dDriverAdapter, -100, -20));
        complexCommand.add(new OperateToCommand(job2dDriverAdapter, -100, 20));
        complexCommand.add(new OperateToCommand(job2dDriverAdapter, 100, 20));
        complexCommand.execute();
    }

}
