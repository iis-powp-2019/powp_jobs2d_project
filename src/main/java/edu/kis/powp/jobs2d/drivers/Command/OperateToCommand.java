package edu.kis.powp.jobs2d.drivers.Command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand{
    private int x;
    private int y;

    public void setDriver(Job2dDriver driver) {
        this.driver = driver;
    }

    private Job2dDriver driver;

    public OperateToCommand(int x, int y, Job2dDriver driver){
        this.driver = driver;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        driver.operateTo(this.x,this.y);
    }
}
