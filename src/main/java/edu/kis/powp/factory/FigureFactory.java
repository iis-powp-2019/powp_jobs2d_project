package edu.kis.powp.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.util.ArrayList;

public class FigureFactory {

    public static DriverCommand getTriangle(DriverManager driverManager) {
        ArrayList<DriverCommand> driverCommandArrayList = new ArrayList<>();

        driverCommandArrayList.add(new SetPositionCommand(0, 0, driverManager.getCurrentDriver()));
        driverCommandArrayList.add(new OperateToCommand(150, 0, driverManager.getCurrentDriver()));
        driverCommandArrayList.add(new OperateToCommand(75, 75, driverManager.getCurrentDriver()));
        driverCommandArrayList.add(new OperateToCommand(0, 0, driverManager.getCurrentDriver()));

        return new ComplexCommand(driverCommandArrayList);
    }

    public static DriverCommand getCircle(DriverManager driverManager) {
        ArrayList<DriverCommand> driverCommandArrayList = new ArrayList<>();

        driverCommandArrayList.add(new SetPositionCommand(100, 0, driverManager.getCurrentDriver()));

        for(int i = 0; i < 1080; i++) {
            driverCommandArrayList.add(
                    new OperateToCommand((int)(100 * Math.cos(i)), (int)(100 * Math.sin(i)), driverManager.getCurrentDriver()));
        }

        return new ComplexCommand(driverCommandArrayList);
    }

    public static DriverCommand getDeltoid(DriverManager driverManager) {
        ArrayList<DriverCommand> driverCommandArrayList = new ArrayList<>();

        driverCommandArrayList.add(new SetPositionCommand(150, 0, driverManager.getCurrentDriver()));
        driverCommandArrayList.add(new OperateToCommand(75, 75, driverManager.getCurrentDriver()));
        driverCommandArrayList.add(new OperateToCommand(0, 0, driverManager.getCurrentDriver()));
        driverCommandArrayList.add(new OperateToCommand(75, -150, driverManager.getCurrentDriver()));
        driverCommandArrayList.add(new OperateToCommand(150, 0, driverManager.getCurrentDriver()));

        return new ComplexCommand(driverCommandArrayList);
    }

}
