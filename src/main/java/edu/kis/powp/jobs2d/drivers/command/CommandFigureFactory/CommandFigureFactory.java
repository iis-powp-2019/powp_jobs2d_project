package edu.kis.powp.jobs2d.drivers.command.CommandFigureFactory;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class CommandFigureFactory {

    public static DriverCommand getSquare(DriverManager driverManager){
        Integer positions[] = {
                80, 80,
                80, -80,
                -80, -80,
                -80, 80
        };

        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(-80, 80, driverManager.getCurrentDriver()));

        for(int i = 0; i < positions.length; i += 2)
        {
            command.addCommand(new OperateToCommand(positions[i], positions[i+1], driverManager.getCurrentDriver()));
        }

        return command;
    }

    public static DriverCommand getTriangle(DriverManager driverManager){
        Integer positions[] = {
                80, 80,
                0,0,
                -80,80
        };

        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(-80,80, driverManager.getCurrentDriver()));

        for(int i = 0; i < positions.length; i += 2){
            command.addCommand(new OperateToCommand(positions[i], positions[i+1], driverManager.getCurrentDriver()));
        }

        return command;
    }

    public static DriverCommand getCircle(Integer radius, DriverManager driverManager){
        ComplexCommand command = new ComplexCommand();

        Double x  = Math.sin(Math.toRadians(0)) * radius;
        Double y = Math.cos(Math.toRadians(0)) * radius;

        command.addCommand(new SetPositionCommand(x.intValue(),y.intValue(),driverManager.getCurrentDriver()));
        for(double i = 0.1; i < 360; i+=0.1){
            x  = Math.sin(Math.toRadians(i)) * radius;
            y = Math.cos(Math.toRadians(i)) * radius;
            command.addCommand(new OperateToCommand(x.intValue(), y.intValue(), driverManager.getCurrentDriver()));
        }
        return  command;
    }
}
