package edu.kis.powp.jobs2d.drivers.factory.EnhancedLine;

import edu.kis.legacy.drawer.shape.line.SpecialLine;
import edu.kis.powp.jobs2d.drivers.factory.IEnhancedLine;

import java.awt.*;

public class EnhancedSpecialLine extends AbstractEnhancedLine {
    public EnhancedSpecialLine()
    {
        super();
        color = Color.CYAN;
        thickness = 3.0f;
        dotted = true;
    }
}
