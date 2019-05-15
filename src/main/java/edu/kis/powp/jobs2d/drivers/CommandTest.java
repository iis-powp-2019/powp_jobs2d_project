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
        otc.y = -80;
        otc.execute();
        otc.x = 80;
        otc.y = -80;
        otc.execute();
        otc.x = 80;
        otc.y = 80;
        otc.execute();
        otc.x = -80;
        otc.y = 80;
        otc.execute();
        otc.x = -80;
        otc.y = -80;
        otc.execute();
        otc.x = 0;
        otc.y = -160;
        otc.execute();
        otc.x = 80;
        otc.y = -80;
        otc.execute();
        otc.x = -80;
        otc.y = 80;
        otc.execute();
    }

    public static void rect(Job2dDriver driver)
    {
        SetPositionCommand spc = new SetPositionCommand(driver);
        OperateToCommand otc = new OperateToCommand(driver);

        spc.x = -80;
        spc.y = -80;
        spc.execute();
        otc.x = 80;
        otc.y = -80;
        otc.execute();
        otc.x = 80;
        otc.y = 80;
        otc.execute();
        otc.x = -80;
        otc.y = 80;
        otc.execute();
        otc.x = -80;
        otc.y = -80;
        otc.execute();
    }

    public static void circle(Job2dDriver driver)
    {
        SetPositionCommand spc = new SetPositionCommand(driver);
        OperateToCommand otc = new OperateToCommand(driver);

        spc.x = 0;
        spc.y = 80;
        spc.execute();
        for(int i = 0; i < 180; ++ i)
        {
            otc.x = (int)(80 * Math.cos(i * 2));
            otc.y = (int)(80 * Math.sin(i * 2));
            otc.execute();
        }
    }

}
