package command;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.DrawAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;

public class SetPositionCommand implements DriverCommand{
    private int x,y;
    private Job2dDriver jobs2ddriver= new DrawAdapter();
    public void execute(){
        jobs2ddriver.setPosition(x,y);
    }

}
