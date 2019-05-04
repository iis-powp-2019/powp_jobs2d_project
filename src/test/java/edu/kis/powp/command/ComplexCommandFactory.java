package edu.kis.powp.command;


import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommandFactory implements AbstractCommandFactory {

    private Job2dDriver job2dDriver;
    static List<DriverCommand> com = new ArrayList<>();

    public ComplexCommandFactory(Job2dDriver job2dDriver) {
        this.job2dDriver = job2dDriver;
    }

    @Override
    public ComplexCommand createFigure(String type) {
        switch (type) {
            case "sqr":
                return new Square();
            case "rect":
                return new Rectangle();
            case "triangle":
                return new Triangle();
        }
        return null;
    }


    class Square extends ComplexCommand {

        public Square() {
            super(com);
            com.add(new SetPositionCommand(0, 0, job2dDriver));
            com.add(new OperateToCommand(0, -200, job2dDriver));
            com.add(new OperateToCommand(200, -200, job2dDriver));
            com.add(new OperateToCommand(200, 0, job2dDriver));
            com.add(new OperateToCommand(0, 0, job2dDriver));
        }
    }

    class Rectangle extends ComplexCommand {

        public Rectangle() {
            super(com);
            com.add(new SetPositionCommand(0, 0, job2dDriver));
            com.add(new OperateToCommand(0, -100, job2dDriver));
            com.add(new OperateToCommand(200, -100, job2dDriver));
            com.add(new OperateToCommand(200, 0, job2dDriver));
            com.add(new OperateToCommand(0, 0, job2dDriver));
        }
    }

    class Triangle extends ComplexCommand {

        public Triangle() {
            super(com);
            com.add(new SetPositionCommand(0, 0, job2dDriver));
            com.add(new OperateToCommand(100, 200, job2dDriver));
            com.add(new OperateToCommand(200, 0, job2dDriver));
            com.add(new OperateToCommand(0, 0, job2dDriver));
        }
    }
}

