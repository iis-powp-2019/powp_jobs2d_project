package command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SetPositionCommand implements DriverCommand {
	private int x,y;


    public SetPositionCommand( int x, int y) {
        this.x = x;
        this.y = y;
       
    }

    @Override
    public void execute() {
    	DriverManager driverManager = new DriverManager();
        Job2dDriver job2dDriver = driverManager.getCurrentDriver();
        job2dDriver.setPosition(x, y);
    }

}
