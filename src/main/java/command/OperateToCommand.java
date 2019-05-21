package command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class OperateToCommand implements DriverCommand{
	
	private int x;
    private int y;
   // private Job2dDriver driver;

    public OperateToCommand(int x, int y) {
        this.x = x;
        this.y = y;
       // this.driver = driver;
    }

	@Override
	public void execute() {
		DriverManager driverManager = new DriverManager();
        Job2dDriver job2dDriver = driverManager.getCurrentDriver();
        job2dDriver.operateTo(x, y);
		
	}
	
	

}
