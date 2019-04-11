package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.factory.EnhancedLineFactory;
import edu.kis.powp.jobs2d.features.DrawerFeature;



public class LineDrawerAdapter implements Job2dDriver {
    private int startX = 0, startY = 0;
    ILine line;
    LineType type;

    public LineDrawerAdapter(){
        super();
        line = EnhancedLineFactory.getBasicLine();
    }



    public LineDrawerAdapter(LineType type) {
        super();
        if(type == LineType.NORMAL)
        {
            this.line = EnhancedLineFactory.getBasicLine();
        }
        else if(type == LineType.DOTTED)
        {
            this.line = EnhancedLineFactory.getDottedLine();
        }
        else if(type == LineType.SPECIAL)
        {
            this.line = EnhancedLineFactory.getSpecialLine();
        }

        this.type = type;
    }


    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        DrawerFeature.getDrawerController().drawLine(line);
        setPosition(x,y);
    }

    @Override
    public String toString() {
        if(this.type == LineType.NORMAL)
            return "Normal line drawer";
        if(this.type == LineType.DOTTED)
            return "Dotted line drawer";
        if(this.type == LineType.SPECIAL)
            return "Special line drawer";
        return "Unknown line drawer";
    }

    public enum LineType
    {
        NORMAL,
        DOTTED,
        SPECIAL
    }
}
