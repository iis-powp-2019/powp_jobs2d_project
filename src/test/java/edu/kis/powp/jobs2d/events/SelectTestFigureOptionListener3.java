package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import edu.kis.powp.jobs2d.commands.DriverCommand;
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
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(driverManager.getCurrentDriver(), 0, 0));
        commands.add(new OperateToCommand(driverManager.getCurrentDriver(), 45, -45));
        commands.add(new OperateToCommand(driverManager.getCurrentDriver(), 0, -90));
        commands.add(new OperateToCommand(driverManager.getCurrentDriver(), -45, -45));
        commands.add(new OperateToCommand(driverManager.getCurrentDriver(), 0, 0));
        for (DriverCommand command : commands) {
            command.execute();
        }
    }
}
