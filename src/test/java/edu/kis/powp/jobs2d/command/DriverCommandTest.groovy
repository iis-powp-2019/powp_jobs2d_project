package edu.kis.powp.jobs2d.command

import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.LoggerDriver;
import edu.kis.powp.jobs2d.drivers.adapter.DrawPanelControllerJobs2Adapter;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class DriverCommandTest  {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("global");
        logger.setLevel(Level.ALL);
        logger.addHandler(new Handler() {
            @Override
            public void publish(LogRecord record) {
                System.out.println(record.getMessage());
            }
            @Override
            public void flush() {

            }
            @Override
            public void close() throws SecurityException {

            }
        });
        Job2dDriver driver = new LoggerDriver();
        int x = 0, y = 0;
        DriverCommand setPositionCommand = new SetPositionCommand(driver, x, y);
        x = 10;
        y = 10;
        DriverCommand operateToCommand = new OperateToCommand(driver, x, y);

        setPositionCommand.execute();
        operateToCommand.execute();
    }
}
