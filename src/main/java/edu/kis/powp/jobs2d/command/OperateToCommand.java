package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

    private int x;
    private int y;
    private Job2dDriver driver;

    public OperateToCommand(Job2dDriver driver){
        this.driver = driver;
    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = x;
    }

    @Override
    public void execute() {
    	driver.operateTo(x, y);
    }
}
/// Zadanie 7 Wzorzec composite