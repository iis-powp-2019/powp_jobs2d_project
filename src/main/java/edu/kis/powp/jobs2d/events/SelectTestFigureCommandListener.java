package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SelectTestFigureCommandListener implements ActionListener {

    private DriverManager driver;

    public SelectTestFigureCommandListener(DriverManager driver) {
        this.driver = driver;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<DriverCommand> list = new ArrayList<>();
        list.add(new SetPositionCommand(driver.getCurrentDriver(), 100, 100));
        list.add(new OperateToCommand(driver.getCurrentDriver(), -100,-100));
        list.add(new OperateToCommand(driver.getCurrentDriver(), 100, -100));
        list.add(new OperateToCommand(driver.getCurrentDriver(), 100, 100));
        list.add(new OperateToCommand(driver.getCurrentDriver(), -100, 100));
        list.add(new OperateToCommand(driver.getCurrentDriver(), -100, -100));
        list.add(new OperateToCommand(driver.getCurrentDriver(), 0, -200));
        list.add(new OperateToCommand(driver.getCurrentDriver(), 100, -100));
        list.add(new OperateToCommand(driver.getCurrentDriver(), -100, 100));
        list.forEach(DriverCommand::execute);
    }
}
