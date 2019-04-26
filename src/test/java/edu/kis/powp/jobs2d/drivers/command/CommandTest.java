package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.drivers.adapter.Job2dDriverAdapter;
import edu.kis.powp.jobs2d.features.DrawerFeature;

/**
 * Test nie dziala
 */

class CommandTest {

    public static void main(String[] args) {
        DrawPanelController controller = new DrawPanelController();
        DefaultDrawerFrame.getDefaultDrawerFrame().setVisible(true);
        ILine line = LineFactory.getBasicLine();
        Job2dDriverAdapter job2dDriverAdapter = new Job2dDriverAdapter(line, DrawerFeature.getDrawerController());

        OperateToCommand operateToCommand = new OperateToCommand(job2dDriverAdapter, -100, -60);
        SetPositionCommand setPositionCommand = new SetPositionCommand(job2dDriverAdapter, 50, 50);

        setPositionCommand.execute();
        operateToCommand.execute();

        controller.drawLine(line);
    }

}