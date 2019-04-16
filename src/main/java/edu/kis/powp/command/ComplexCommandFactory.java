package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommandFactory {

    public static ComplexCommand figureScriptRectangle(Job2dDriver driver) {

        ComplexCommand commandList = new ComplexCommand();

        commandList.addCommand(new SetPositionCommand(driver, -100, -50));
        commandList.addCommand(new OperateToCommand(driver, -100, 50));
        commandList.addCommand(new OperateToCommand(driver, 100, 50));
        commandList.addCommand(new OperateToCommand(driver, 100, -50));
        commandList.addCommand(new OperateToCommand(driver, -100, -50));

        return commandList;
    }

    public static ComplexCommand figureScriptCircle(Job2dDriver driver) {

        ComplexCommand commandList = new ComplexCommand();

        final int r = 150;
        final int degreeStep = 12;
        commandList.addCommand(new SetPositionCommand(driver, r, 0));

        for(int angle = degreeStep; angle < 360; angle += degreeStep)
        {
            double radians = Math.toRadians(angle);

            double x = r*Math.cos(radians);
            double y = r*Math.sin(radians);

            commandList.addCommand(new OperateToCommand(driver, (int)x, (int)y));
        }

        commandList.addCommand(new OperateToCommand(driver, r, 0));

        return commandList;
    }
}
