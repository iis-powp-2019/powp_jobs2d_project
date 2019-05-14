package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class AbstractDriverAdapter extends AbstractDriver {

    public AbstractDriverAdapter(int x, int y) {
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
        return "Abstract Driver Adapter";
    }
}
