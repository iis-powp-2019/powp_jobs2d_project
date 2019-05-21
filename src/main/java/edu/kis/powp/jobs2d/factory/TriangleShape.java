package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

class TriangleShape {

    static ComplexCommand prepareTriangle(){
        ComplexCommand triangle = new ComplexCommand();

        triangle.commands.add(new SetPositionCommand(-100,0));
        triangle.commands.add(new OperateToCommand(100,0));
        triangle.commands.add(new OperateToCommand(0,-100));
        triangle.commands.add(new OperateToCommand(-100,0));

        return triangle;
    }
}
