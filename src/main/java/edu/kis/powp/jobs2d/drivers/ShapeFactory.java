package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {
    private Job2dDriver job2dDriver;

    public ShapeFactory(Job2dDriver driver){
        job2dDriver = driver;
    }

    public DriverCommand drawCircle(int x, int y ,int radius, int points){

        List<DriverCommand> listOfCommands = new ArrayList<>();
        int x_start = x;
        int y_start = y + radius;
        int tmp_x =0;
        int tmp_y = 0;

        double intern_angle = Math.PI * 2 / points;
        double angle = intern_angle;
        listOfCommands.add(new SetPositionCommand(x_start,y_start,job2dDriver));
        for(int i =0 ;i<points;i++){
            tmp_x = (int) ((x_start - x) * Math.cos(angle) -(y_start - y)* Math.sin(angle) + x);
            tmp_y = (int) ((x_start - x) * Math.sin(angle) +(y_start - y)* Math.cos(angle) + y);
            listOfCommands.add(new OperateToCommand(tmp_x,tmp_y,job2dDriver));
            angle += intern_angle;
        }
        return new ComplexCommand(listOfCommands);
    }

    public DriverCommand createSquare(int left_up_corner_x, int left_up_corner_y, int right_down_corner_x,int right_down_corner_y){
        List<DriverCommand> listOfCommands = new ArrayList<>();
        listOfCommands.add(new SetPositionCommand(left_up_corner_x,left_up_corner_y,job2dDriver));
        listOfCommands.add(new OperateToCommand(right_down_corner_x,left_up_corner_y,job2dDriver));
        listOfCommands.add(new OperateToCommand(right_down_corner_x,right_down_corner_y,job2dDriver));
        listOfCommands.add(new OperateToCommand(left_up_corner_x,right_down_corner_y,job2dDriver));
        listOfCommands.add(new OperateToCommand(left_up_corner_x,left_up_corner_y,job2dDriver));
        return new ComplexCommand(listOfCommands);
    }
}
