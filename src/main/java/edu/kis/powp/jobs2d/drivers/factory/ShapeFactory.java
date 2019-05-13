package edu.kis.powp.jobs2d.drivers.factory;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;

public class ShapeFactory {

    private static final String SQUARE = "Square";

    private static final String RECTANGLE = "Rectangle";

    public static DriverCommand getShape(DriverManager driverManager, String type) {
        switch (type) {
            case SQUARE:
                return Square.draw(driverManager);
            case RECTANGLE:
                return Rectangle.draw(driverManager);
            default:
                return null;
        }
    }

}
