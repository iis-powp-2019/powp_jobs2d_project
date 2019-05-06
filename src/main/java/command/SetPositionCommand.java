package command;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.DrawAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;

public class SetPositionCommand implements DriverCommand{
    private int x,y;

    private Job2dDriver jobs2ddriver;
    @Override
    public void execute(){
        jobs2ddriver.setPosition(x,y);
    }
    public SetPositionCommand(int x, int y, Job2dDriver job2dDriver){
        this.x=x;
        this.y=y;
        this.jobs2ddriver=job2dDriver;
    }

}
