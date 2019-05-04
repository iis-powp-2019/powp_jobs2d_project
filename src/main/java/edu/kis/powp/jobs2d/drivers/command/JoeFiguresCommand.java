package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;


public class JoeFiguresCommand implements DriverCommand{

    private DriverManager driverManager;
    private JoeScripts script;

    public JoeFiguresCommand(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    public DriverCommand selectScript(JoeScripts script){
        this.script = script;
        return this;
    }

    @Override
    public void execute() {
        switch (this.script){
            case SCRIPT1:
                FiguresJoe.figureScript1(driverManager.getCurrentDriver());
                break;
            case SCRIPT2:
                FiguresJoe.figureScript2(driverManager.getCurrentDriver());
                break;
            default:
                break;
        }
    }

    public enum JoeScripts {
        SCRIPT1,
        SCRIPT2
    }
}
