package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.Command.ComplexCommand;
import edu.kis.powp.jobs2d.Command.DriverCommand;
import edu.kis.powp.jobs2d.Command.OperateToCommand;
import edu.kis.powp.jobs2d.Command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SelectTestCommandOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTestCommandOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(10,0,driverManager.getCurrentDriver()));
        commands.add(new OperateToCommand(0,-10,driverManager.getCurrentDriver()));
        commands.add(new OperateToCommand(10,-10, driverManager.getCurrentDriver()));
        ComplexCommand complexCommand = new ComplexCommand(driverManager.getCurrentDriver(), commands);
        complexCommand.execute();
    }
}
