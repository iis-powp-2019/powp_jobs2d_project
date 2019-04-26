package command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;

public class OperateToCommand implements DriverCommand {
    private int x,y;
    private Job2dDriver job2dDriver;
    @Override
    public void execute() {
        job2dDriver.operateTo(x,y);
    }

    public OperateToCommand(int x, int y,Job2dDriver job2dDriver) {
        this.job2dDriver=job2dDriver;
        this.x=x;
        this.y=y;
    }
}
