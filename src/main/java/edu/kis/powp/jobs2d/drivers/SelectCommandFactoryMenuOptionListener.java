package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Command.CommandFactory;
import edu.kis.powp.jobs2d.Command.ComplexCommand;
import edu.kis.powp.jobs2d.Command.DriverCommand;
import edu.kis.powp.jobs2d.features.DriverFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SelectCommandFactoryMenuOptionListener implements ActionListener {
    private DriverManager driverManager;
    private String shape;

    public SelectCommandFactoryMenuOptionListener(DriverManager driverManager,String shape) {
        this.driverManager = driverManager;
        this.shape = shape;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<DriverCommand> commands;
        if(shape.equals("triangle"))
            commands = CommandFactory.drawTriangle(driverManager.getCurrentDriver());
        else if(shape.equals("square"))
            commands = CommandFactory.drawSquare(driverManager.getCurrentDriver());
        else
            commands = CommandFactory.drawRectangle(driverManager.getCurrentDriver());

        ComplexCommand complexCommand = new ComplexCommand(commands);
        complexCommand.execute();

        DriverFeature.updateDriverInfo();
    }

}
