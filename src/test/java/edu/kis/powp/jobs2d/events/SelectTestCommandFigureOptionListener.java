package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestCommandFigureOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestCommandFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SetPositionCommand setPositionCommand = new SetPositionCommand(0, 0, driverManager.getCurrentDriver());
        OperateToCommand operateToCommand = new OperateToCommand(100, 0, driverManager.getCurrentDriver());
        OperateToCommand operateToCommand1 = new OperateToCommand(100, 100, driverManager.getCurrentDriver());
        OperateToCommand operateToCommand2 = new OperateToCommand(0, 100, driverManager.getCurrentDriver());
        OperateToCommand operateToCommand3 = new OperateToCommand(0, 0, driverManager.getCurrentDriver());

        ArrayList<DriverCommand> driverCommandArrayList = new ArrayList<>();

        driverCommandArrayList.add(setPositionCommand);
        driverCommandArrayList.add(operateToCommand);
        driverCommandArrayList.add(operateToCommand1);
        driverCommandArrayList.add(operateToCommand2);
        driverCommandArrayList.add(operateToCommand3);

        ComplexCommand complexCommand = new ComplexCommand(driverCommandArrayList);
        complexCommand.execute();
    }
}
