package edu.kis.powp.jobs2d.command.Figures;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class CommandIIS {

    public static ComplexCommand getFigure() {
        return new ComplexCommand(
                new SetPositionCommand(-190, -125),
                new OperateToCommand(-190,-40),
                new OperateToCommand(-100,-40),
                new OperateToCommand(-100,-125),
                new OperateToCommand(-190,-125),

                new SetPositionCommand(-190, -25),
                new OperateToCommand(-190, 230),
                new OperateToCommand(-100, 230),
                new OperateToCommand(-100, -25),
                new OperateToCommand(-190, -25),

                new SetPositionCommand(-90, -125),
                new OperateToCommand(-90, 130),
                new OperateToCommand(0, 130),
                new OperateToCommand(0, -125),
                new OperateToCommand(-90, -125),

                new SetPositionCommand(-50, -230),
                new OperateToCommand(-40,-230),
                new OperateToCommand(-25,-225),
                new OperateToCommand(-15,-220),
                new OperateToCommand(-10,-215),
                new OperateToCommand(-5,-205),
                new OperateToCommand(-0,-190),
                new OperateToCommand(-0,-180),
                new OperateToCommand(-5,-165),
                new OperateToCommand(-10,-155),
                new OperateToCommand(-15,-150),
                new OperateToCommand(-25,-145),
                new OperateToCommand(-40,-140),
                new OperateToCommand(-50,-140),
                new OperateToCommand(-65,-145),
                new OperateToCommand(-75,-150),
                new OperateToCommand(-80,-155),
                new OperateToCommand(-85,-165),
                new OperateToCommand(-90,-180),
                new OperateToCommand(-90,-190),
                new OperateToCommand(-85,-205),
                new OperateToCommand(-80,-215),
                new OperateToCommand(-75,-220),
                new OperateToCommand(-65,-225),
                new OperateToCommand(-50,-230),

                new SetPositionCommand(10, -125),
                new OperateToCommand(10, -55),
                new OperateToCommand(95,100),
                new OperateToCommand(95, 120),
                new OperateToCommand(85, 135),
                new OperateToCommand(70, 145),
                new OperateToCommand(-90, 145),
                new OperateToCommand(-90, 230),
                new OperateToCommand(70, 230),
                new OperateToCommand(100, 225),
                new OperateToCommand(150, 200),
                new OperateToCommand(180, 150),
                new OperateToCommand(185, 120),
                new OperateToCommand(185, 100),
                new OperateToCommand(180, 70),
                new OperateToCommand(100, -75),
                new OperateToCommand(100, -125),
                new OperateToCommand(10, -125)
        );
    }
}
