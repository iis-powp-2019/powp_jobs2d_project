package command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Square implements ActionListener {
    private DriverManager driverManager;
    private Job2dDriver job2dDriver;

    public Square(DriverManager driverManager) {

        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        job2dDriver=driverManager.getCurrentDriver();
        ComplexCommand complexCommand=new ComplexCommand();
        complexCommand.addCommend(new SetPositionCommand( -40, -40,job2dDriver));
        complexCommand.addCommend(new OperateToCommand( -40, 40,job2dDriver));
        complexCommand.addCommend(new OperateToCommand( 40, 40,job2dDriver));
        complexCommand.addCommend(new OperateToCommand( 40, -40,job2dDriver));
        complexCommand.addCommend(new OperateToCommand( -40, -40,job2dDriver));
        complexCommand.execute();

    }
}