package edu.kis.powp.jobs2d.drivers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class SelectTestCommandFigureOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTestCommandFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
		SetPositionCommand command1 = new SetPositionCommand(driverManager.getCurrentDriver(),0,0);
		OperateToCommand command2 = new OperateToCommand(driverManager.getCurrentDriver(),0,10);
		OperateToCommand command3 = new OperateToCommand(driverManager.getCurrentDriver(), 10,10);
		OperateToCommand command4 = new OperateToCommand(driverManager.getCurrentDriver(), 10,0);
		OperateToCommand command5 = new OperateToCommand(driverManager.getCurrentDriver(),0,0);
		ComplexCommand complex = new ComplexCommand(Arrays.asList(command1,command2,command3,command4,command5));
		complex.execute();
        DriverFeature.updateDriverInfo();
    }
}
