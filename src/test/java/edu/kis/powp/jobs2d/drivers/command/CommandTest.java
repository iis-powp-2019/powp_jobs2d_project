package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test nie dziala
 */

class CommandTest {

    public static void main(String[] args) {
        DrawPanelController controller = new DrawPanelController();
        DefaultDrawerFrame.getDefaultDrawerFrame().setVisible(true);
        ILine line = LineFactory.getBasicLine();
        LineDrawerAdapter lineDrawerAdapter = new LineDrawerAdapter(line);

        OperateToCommand operateToCommand = new OperateToCommand(lineDrawerAdapter, -100, -60);
        SetPositionCommand setPositionCommand = new SetPositionCommand(lineDrawerAdapter, 50, 50);

        setPositionCommand.execute();
        operateToCommand.execute();

        controller.drawLine(line);
    }

}