package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {
    private Job2dDriver job2dDriver;

    public ShapeFactory(Job2dDriver driver){
        job2dDriver = driver;
    }

    public void drawCircle(int x, int y ,int radius, int points){

        List<DriverCommand> listOfCommands = new ArrayList<>();
        int x_start = x;
        int y_start = y + radius;
        double intern_angle = 360 / points;
        listOfCommands.add(new SetPositionCommand(x,y +radius,job2dDriver));

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
