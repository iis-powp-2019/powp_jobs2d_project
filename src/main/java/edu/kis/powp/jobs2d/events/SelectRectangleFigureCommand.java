package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.FigureFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectRectangleFigureCommand implements ActionListener {

    private DriverManager manager;

    public SelectRectangleFigureCommand(DriverManager manager) {
        this.manager = manager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(FigureFactory.getRectangleFactory(this.manager));
        complexCommand.execute();
    }
}
