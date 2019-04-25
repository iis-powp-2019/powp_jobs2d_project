package edu.kis.powp.jobs2d.drivers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class SelectDriverMenuOptionListener implements ActionListener {
	private DriverManager driverManager;
	private Job2dDriver driver = null;

	public SelectDriverMenuOptionListener(Job2dDriver driver, DriverManager driverManager) {
		this.driverManager = driverManager;
		this.driver = driver;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		driverManager.setCurrentDriver(driver);
		/*SetPositionCommand command1 = new SetPositionCommand(driver,0,0);
		OperateToCommand command2 = new OperateToCommand(driver,0,10);
		OperateToCommand command3 = new OperateToCommand(driver, 10,10);
		OperateToCommand command4 = new OperateToCommand(driver, 10,0);
		OperateToCommand command5 = new OperateToCommand(driver,0,0);
		ComplexCommand complex = new ComplexCommand(Arrays.asList(command1,command2,command3,command4,command5));
		complex.execute();*/
		DriverFeature.updateDriverInfo();
	}
}
