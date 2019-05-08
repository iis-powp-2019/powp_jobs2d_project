package edu.kis.powp.jobs2d.command.factory;

import edu.kis.powp.jobs2d.command.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class ComplexCommandFactory {
    public static ComplexCommand getInstance(String name) {
        switch (name) {
            case "rectangle":
                List<DriverCommand> script = new ArrayList<>();
                script.add(new SetPositionCommand(0, 0));
                script.add(new OperateToCommand(100, 0));
                script.add(new OperateToCommand(100,100));
                script.add(new OperateToCommand(0, 100));
                script.add(new OperateToCommand(0, 0));
                return new ComplexCommand(script);
            case "circle":
                List<DriverCommand> circleScript = new ArrayList<>();
                circleScript.add(new SetPositionCommand(100, 0));
                for(double i = 0.0; i <= 360.0; i += 10.0) {
                    circleScript.add(new OperateToCommand((int) (Math.cos(i * Math.PI / 180.0) * 100.0) , (int) (Math.sin(i * Math.PI / 180.0) * 100.0)));
                }
                return new ComplexCommand(circleScript);
            default:
                return new ComplexCommand(Collections.emptyList());
        }
    }
}
