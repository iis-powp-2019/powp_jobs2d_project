package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class FigureFactory {

    public static DriverCommand getSquare(DriverManager driverManager) {
        ComplexCommand complex = new ComplexCommand();
        complex.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(), 1, 0));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 1, 50));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 50, 0));
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 5, 50));

        return complex;
    }

    public static DriverCommand getCircle(DriverManager driverManager) {
        ComplexCommand complex = new ComplexCommand();
    

        double step = (2*Math.PI/20);  
    
        int r = 50;

        complex.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(),r, 0));
        for(double theta=0;  theta < 2*Math.PI;  theta+=step)
         { int x = (int) ( r*Math.cos(theta));
           int y = (int) ( r*Math.sin(theta));   
           complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), x, y));

         }
        complex.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), r, 0));
      
        return complex;
    }
}
