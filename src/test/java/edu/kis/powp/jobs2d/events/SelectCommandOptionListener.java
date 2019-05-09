package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectCommandOptionListener implements ActionListener {

    private DriverManager manager;

    public SelectCommandOptionListener(DriverManager manager) {
        this.manager = manager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(manager.getCurrentDriver(), 0,0));
        complexCommand.addCommand(new OperateToCommand(manager.getCurrentDriver(), 0,100));
        complexCommand.addCommand(new OperateToCommand(manager.getCurrentDriver(), 100,100));
        complexCommand.addCommand(new OperateToCommand(manager.getCurrentDriver(), 100,0));
        complexCommand.addCommand(new OperateToCommand(manager.getCurrentDriver(), 0,0));
        complexCommand.execute();
    }
}
