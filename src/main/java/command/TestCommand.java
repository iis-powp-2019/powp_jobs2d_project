package command;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class TestCommand {
    ArrayList<DriverCommand> commandQueue = new ArrayList <>();

    public static void main(String[] args){
        DrawPanelController controller = new DrawPanelController();
        DefaultDrawerFrame.getDefaultDrawerFrame().setVisible(true);
        ILine line = LineFactory.getBasicLine();
        line.setStartCoordinates(-150, -100);
        line.setEndCoordinates(70, 10);
        controller.drawLine(line);
        TestCommand ds = new TestCommand();
        ds.test();
    }

    private void test(){
        int x=1,y=1;
        commandQueue.add(new SetPositionCommand(x,y));
        commandQueue.add(new SetPositionCommand(x,y));
        commandQueue.add(new SetPositionCommand(x,y));
        commandQueue.add(new OperateToCommand(x,y));

        for (DriverCommand command : commandQueue){
            if (command instanceof DriverCommand){
                command.execute();
            }
        }
    }
}