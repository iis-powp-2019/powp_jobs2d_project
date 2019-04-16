package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class FigureJaneDriver extends AbstractDriver {

    public FigureJaneDriver(int x, int y) {
        super(x, y);
    }

    @Override
    public void operateTo(int x, int y) {
        Job2dDriver driver = DriverFeature.getDriverManager().getCurrentDriver();
        driver.setPosition(getX(), getY());
        driver.operateTo(x, y);
        setPosition(x, y);
    }

    public String toString() {
        return "Figure Jane driver";
    }
}
