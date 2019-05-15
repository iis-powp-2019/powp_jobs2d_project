package edu.kis.powp.jobs2d.command;

import com.sun.istack.internal.NotNull;
import edu.kis.powp.jobs2d.Job2dDriver;

public interface DriverCommand {

    void setDriver(Job2dDriver driver);
    void execute();
    void execute(@NotNull Job2dDriver driver);
}
