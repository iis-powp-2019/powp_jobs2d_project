package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SelectCommandOprionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectCommandOprionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(80, 80, driverManager.getCurrentDriver()));
        commands.add(new OperateToCommand(-80,-80, driverManager.getCurrentDriver()));
        commands.add(new OperateToCommand(80, -80, driverManager.getCurrentDriver()));
        commands.add(new OperateToCommand(80, 80, driverManager.getCurrentDriver()));
        commands.add(new OperateToCommand(-80, 80, driverManager.getCurrentDriver()));
        commands.add(new OperateToCommand(-80, -80, driverManager.getCurrentDriver()));
        commands.add(new OperateToCommand(0, -160, driverManager.getCurrentDriver()));
        commands.add(new OperateToCommand(80, -80, driverManager.getCurrentDriver()));
        commands.add(new OperateToCommand(-80, 80, driverManager.getCurrentDriver()));
        commands.forEach(DriverCommand::execute);
    }
}
