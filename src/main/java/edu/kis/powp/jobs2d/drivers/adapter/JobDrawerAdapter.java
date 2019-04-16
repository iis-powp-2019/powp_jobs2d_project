package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.legacy.drawer.shape.line.BasicLine;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

import java.util.List;

/**
 * driver adapter to drawer with several bugs.
 */
public class JobDrawerAdapter implements Job2dDriver {
    private int startX = 0, startY = 0;

    private ILine currentLine = LineFactory.getBasicLine();
    private int currentLineChosed = 1;

    public void choseLineStyle(int choice) {
        if (choice != currentLineChosed) {
            currentLineChosed = choice;
            switch (currentLineChosed) {
                case 1:
                    currentLine = LineFactory.getBasicLine();
                    break;
                case 2:
                    currentLine = LineFactory.getDottedLine();
                    break;
                case 3:
                    currentLine = LineFactory.getSpecialLine();
                    break;
            }
        }
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        currentLine.setStartCoordinates(this.startX, this.startY);
        currentLine.setEndCoordinates(x, y);

        DrawPanelController drawPanelController = DrawerFeature.getDrawerController();
        drawPanelController.drawLine(currentLine);
        setPosition(x, y);
    }

    @Override
    public String toString() {
        return "@Q!$!@$!#@$(*#@&Q(%^*#@";
    }
}
