
package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.SetPositionCommand;

/**
 * driver adapter to drawer with several bugs.
 */
public class LineDrawerAdapter implements Job2dDriver{
    private int startX = 0, startY = 0;
    private ILine line;
    private OperateToCommand operateToCommand;
    private SetPositionCommand setPositionCommand;

    public LineDrawerAdapter(ILine line) {
        super();
        this.line = line;
    }

    @Override
    public void setPosition(int x, int y){
        setPositionCommand = new SetPositionCommand(x, y);
        setPositionCommand.execute(this);
    }

    @Override
    public void operateTo(int x, int y) {
        operateToCommand = new OperateToCommand(x, y);
        setPositionCommand = new SetPositionCommand(x, y);

        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

        operateToCommand.execute(this);

    }

    //    @Override
//    public void setPosition(int x, int y) {
//        this.startX = x;
//        this.startY = y;
//    }
//
//    @Override
//    public void operateTo(int x, int y) {
//        line.setStartCoordinates(this.startX, this.startY);
//        line.setEndCoordinates(x, y);
//
//        setPosition(x,y);
//        DrawerFeature.getDrawerController().drawLine(line);
//    }

    @Override
    public String toString() {
        return "LineDrawerAdapter";
    }
}
