package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DrawerAdapter;

public class SelectTestFigureOptionListener3 implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionListener3(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<DriverCommand> commands = new ArrayList();
        commands.add(new SetPositionCommand(new DrawerAdapter(), 3, 5));
        SetPositionCommand command1 = (SetPositionCommand) commands.get(0);
        command1.execute();
        commands.add(new OperateToCommand(new DrawerAdapter(), 4, 8));
        OperateToCommand command2 = (OperateToCommand) commands.get(1);
        command2.execute();
    }
}
