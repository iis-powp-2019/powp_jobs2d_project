package command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.DrawAdapter;

public class OperateToCommand implements DriverCommand {
    private int x,y;
    private Job2dDriver jobs2ddriver= new DrawAdapter();

    public OperateToCommand(int x,int y){
        this.x=x;
        this.y=y;

    }

    @Override
    public void execute(){
        jobs2ddriver.operateTo(x,y);
    }


}
