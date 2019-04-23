package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommandFactory implements AbstractFactory<ComplexCommand> {

    private Job2dDriver job2dDriver;
    static List<DriverCommand> commands = new ArrayList<>();

    public ComplexCommandFactory(Job2dDriver job2dDriver) {
        this.job2dDriver = job2dDriver;
    }

    @Override
    public ComplexCommand create(String figureType) {

        if("square".equalsIgnoreCase(figureType)){
            return new Square();
        }else if("rectangle".equalsIgnoreCase(figureType)){
            return new Rectangle();
        }

        return null;
    }

    private class Square extends ComplexCommand {

        public Square() {
            super(commands);
            commands.add(new SetPositionCommand(-60,-60,job2dDriver));
            commands.add(new OperetaToCommand(-60,60,job2dDriver));
            commands.add(new OperetaToCommand(60,60,job2dDriver));
            commands.add(new OperetaToCommand(60,-60,job2dDriver));
            commands.add(new OperetaToCommand(-60,-60,job2dDriver));
        }
    }

    private class Rectangle extends ComplexCommand {

        public Rectangle() {
            super(commands);
            commands.add(new SetPositionCommand(-120,-60,job2dDriver));
            commands.add(new OperetaToCommand(-120,60,job2dDriver));
            commands.add(new OperetaToCommand(120,60,job2dDriver));
            commands.add(new OperetaToCommand(120,-60,job2dDriver));
            commands.add(new OperetaToCommand(-120,-60,job2dDriver));
        }
    }
}
