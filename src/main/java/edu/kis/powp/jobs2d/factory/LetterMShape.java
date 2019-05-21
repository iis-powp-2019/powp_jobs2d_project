package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

class LetterMShape {

    static ComplexCommand prepareLetterMShape(){
        ComplexCommand letterM = new ComplexCommand();

        letterM.commands.add(new SetPositionCommand(-100,0));
        letterM.commands.add(new OperateToCommand(-100,-150));
        letterM.commands.add(new OperateToCommand(-25,-100));
        letterM.commands.add(new OperateToCommand(50,-150));
        letterM.commands.add(new OperateToCommand(50,0));

        return letterM;
    }
}
