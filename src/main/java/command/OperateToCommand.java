package command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.DrawAdapter;

public class OperateToCommand implements DriverCommand {
    private int x,y;
    private Job2dDriver jobs2ddriver;

    public OperateToCommand(int x,int y, Job2dDriver jobs2ddriver){
        this.x=x;
        this.y=y;
        this.jobs2ddriver=jobs2ddriver;
    }

    @Override
    public void execute(){
        jobs2ddriver.operateTo(x,y);
    }


}
