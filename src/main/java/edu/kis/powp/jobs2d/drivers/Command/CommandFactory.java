package edu.kis.powp.jobs2d.drivers.Command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandFactory {
    static public ComplexCommand square(int size, Job2dDriver driver){
        ComplexCommand squareCommand = new ComplexCommand();

        squareCommand.addCommand(new SetPositionCommand(0,0,driver));
        squareCommand.addCommand(new OperateToCommand(size,0,driver));
        squareCommand.addCommand(new OperateToCommand(size,size,driver));
        squareCommand.addCommand(new OperateToCommand(0,size,driver));
        squareCommand.addCommand(new OperateToCommand(0,0,driver));
        return squareCommand;
    }
    static public ComplexCommand circle(int size, Job2dDriver driver){
        ComplexCommand circleCommand = new ComplexCommand();

        circleCommand.addCommand(new SetPositionCommand((int)(Math.cos(0) * size), (int)(Math.sin(0) * size),driver));
        for(float i = 0; i <=  Math.PI * 2 ; i+=0.05){
            int x = (int)(Math.cos(i) * size);
            int y = (int)(Math.sin(i) * size);
            circleCommand.addCommand(new OperateToCommand(x,y,driver));
        }
        return circleCommand;
    }
}
