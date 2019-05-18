package edu.kis.powp.jobs2d.Command;

import edu.kis.powp.jobs2d.FigureScript;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class ComplexCommandParserDriver implements Job2dDriver {

    private ComplexCommand complexCommand;

    public ComplexCommandParserDriver() {
        this.complexCommand = new ComplexCommand();
    }

    public ComplexCommandParserDriver(ComplexCommand complexCommand) {
        this.complexCommand = complexCommand;
    }

    public ComplexCommand parseComplexCommand(FigureScript figure) {
        figure.draw(this);
        return this.complexCommand;
    }

    @Override
    public void setPosition(int i, int i1) {
        this.complexCommand.addCommand(new SetPositionCommand(i, i1));
    }

    @Override
    public void operateTo(int i, int i1) {
        this.complexCommand.addCommand(new OperateToCommand(i, i1));
    }
}
