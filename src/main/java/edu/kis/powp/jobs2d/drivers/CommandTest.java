package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.DriverCommandExtend;

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
        FactoryCommand fc = new FactoryCommand();
        fc.Rect(driver, -80, -80, 160, 160).execute();
    }

    public static void circle(Job2dDriver driver)
    {
        FactoryCommand fc = new FactoryCommand();
        fc.Circle(driver, -80, -80, 100).execute();
    }

}
