package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class CommandFactory {

    public static DriverCommand getSquare(DriverManager driverManager) {
        Integer positions[] = {
                80, 80,
                80, -80,
                -80, -80,
                -80, 80
        };

        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(),-80, 80 ));

        for (int i = 0; i < positions.length; i += 2) {
            command.addCommand(new OpareteToCommand(driverManager.getCurrentDriver(),positions[i], positions[i + 1]));
        }

        return command;
    }

    public static DriverCommand getTriangle(DriverManager driverManager) {
        Integer positions[] = {
                80, 80,
                0, 0,
                -80, 80
        };

        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(),-80, 80 ));

        for (int i = 0; i < positions.length; i += 2) {
            command.addCommand(new OpareteToCommand(driverManager.getCurrentDriver(),positions[i], positions[i + 1] ));
        }

        return command;
    }

    public static DriverCommand getCircle(Integer radius, DriverManager driverManager) {
        ComplexCommand command = new ComplexCommand();

        Double x = Math.sin(Math.toRadians(0)) * radius;
        Double y = Math.cos(Math.toRadians(0)) * radius;

        command.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(),x.intValue(), y.intValue() ));
        for (double i = 0.1; i < 360; i += 0.1) {
            x = Math.sin(Math.toRadians(i)) * radius;
            y = Math.cos(Math.toRadians(i)) * radius;
            command.addCommand(new OpareteToCommand(driverManager.getCurrentDriver(),x.intValue(), y.intValue()));
        }
        return command;
    }

}
