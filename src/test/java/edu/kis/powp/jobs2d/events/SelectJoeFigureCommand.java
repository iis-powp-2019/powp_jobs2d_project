package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.JoeFiguresCommand;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectJoeFigureCommand implements ActionListener {
    private DriverManager driverManager;

    public SelectJoeFigureCommand(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new ComplexCommand()
                .addCommand(new JoeFiguresCommand(driverManager).selectScript(JoeFiguresCommand.JoeScripts.SCRIPT1))
                .addCommand(new JoeFiguresCommand(driverManager).selectScript(JoeFiguresCommand.JoeScripts.SCRIPT2))
                .execute();
    }
}
