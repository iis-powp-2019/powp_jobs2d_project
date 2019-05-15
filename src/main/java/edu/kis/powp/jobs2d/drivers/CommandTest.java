package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandTest
{
    public static void figureScript(Job2dDriver driver) {
        SetPositionCommand spc = new SetPositionCommand(driver);
        OperateToCommand otc = new OperateToCommand(driver);
        spc.x = 80;
        spc.y = 80;
        spc.execute();
        otc.x = -80;
        otc.x = -80;
        otc.execute();
        otc.x = 80;
        otc.x = -80;
        otc.execute();
        otc.x = 80;
        otc.x = 80;
        otc.execute();
        otc.x = -80;
        otc.x = 80;
        otc.execute();
        otc.x = -80;
        otc.x = -80;
        otc.execute();
        otc.x = 0;
        otc.x = -160;
        otc.execute();
        otc.x = 80;
        otc.x = -80;
        otc.execute();
        otc.x = -80;
        otc.x = 80;
        otc.execute();
    }
}
