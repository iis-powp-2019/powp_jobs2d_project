package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommandFactory implements CommandFactory<ComplexCommand> {

    private Job2dDriver job2dDriver;
    private static List<DriverCommand> commands = new ArrayList<>();

    public ComplexCommandFactory(Job2dDriver job2dDriver){
        this.job2dDriver = job2dDriver;
    }

    @Override
    public ComplexCommand create(String figureType) {
        switch (figureType)
        {
            case "square":
                return new Square();
            case "triangle":
                return new Triangle();
            default:
                throw new RuntimeException("This figure type is not supported");
        }
    }

    private class Square extends ComplexCommand {
        Square() {
            super(commands);
            commands.add(new SetPositionCommand(-60, -60, job2dDriver));
            commands.add(new OperateToCommand(-60, 60, job2dDriver));
            commands.add(new OperateToCommand(60, 60, job2dDriver));
            commands.add(new OperateToCommand(60, -60, job2dDriver));
            commands.add(new OperateToCommand(-60, -60, job2dDriver));
        }

    }

    private class Triangle extends ComplexCommand {
        Triangle() {
            super(commands);
            commands.add(new SetPositionCommand(0, -60, job2dDriver));
            commands.add(new OperateToCommand(100, 60, job2dDriver));
            commands.add(new OperateToCommand(-100, 60, job2dDriver));
            commands.add(new OperateToCommand(0, -60, job2dDriver));
        }
    }

}
