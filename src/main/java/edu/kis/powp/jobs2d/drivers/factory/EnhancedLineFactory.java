package edu.kis.powp.jobs2d.drivers.factory;


import edu.kis.powp.jobs2d.drivers.factory.EnhancedLine.EnhancedBasicLine;
import edu.kis.powp.jobs2d.drivers.factory.EnhancedLine.EnhancedDottedLine;
import edu.kis.powp.jobs2d.drivers.factory.EnhancedLine.EnhancedSpecialLine;

public class EnhancedLineFactory {
    public static IEnhancedLine getBasicLine() {
        return new EnhancedBasicLine();
    }

    public static IEnhancedLine getDottedLine() {
        return new EnhancedDottedLine();
    }

    public static IEnhancedLine getSpecialLine() {
        return new EnhancedSpecialLine();
    }
}
