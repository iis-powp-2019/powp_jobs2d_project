package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.command.CommandFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureFromNameOptionListener implements ActionListener {

    private final DriverManager manager;
    private final String type;

    public SelectTestFigureFromNameOptionListener(DriverManager manager, String type) {
        this.manager = manager;
        this.type = type;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        switch (type) {
            case "triangle":
                CommandFactory.getTriangleCommand(manager.getCurrentDriver()).execute();
                break;
            case "hexagon":
                CommandFactory.getHexagonCommand(manager.getCurrentDriver()).execute();
                break;
            default:
                throw new RuntimeException("This figure name is not supported");
        }
    }
}
