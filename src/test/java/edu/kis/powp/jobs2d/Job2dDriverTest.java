package edu.kis.powp.jobs2d;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.util.ArrayList;
import java.util.List;

/**
 * Plotter test.
 * 
 * @author Dominik
 */
public class Job2dDriverTest {
	private static Job2dDriver driver = new StubDriver();

	/**
	 * Driver test.
	 */
	public static void main(String[] args) {
		List<DriverCommand> driverCommands = new ArrayList<>();
		ComplexCommand complexCommand;

		driverCommands.add(new SetPositionCommand(-120, -120, driver));
		driverCommands.add(new OperateToCommand(120, -120, driver));
		driverCommands.add(new OperateToCommand(120, 120, driver));
		driverCommands.add(new OperateToCommand(-120, -120, driver));
		driverCommands.add(new OperateToCommand(-120, -120, driver));
		driverCommands.add(new OperateToCommand(120, 120, driver));
		driverCommands.add(new SetPositionCommand(120, -120, driver));
		driverCommands.add(new OperateToCommand(-120, 120, driver));

		complexCommand = new ComplexCommand(driverCommands);
		complexCommand.execute();

		System.out.println();
		FiguresJoe.figureScript1(driver);
		System.out.println();
		FiguresJoe.figureScript2(driver);
	}

	private static class StubDriver implements Job2dDriver {

		@Override
		public void operateTo(int x, int y) {
			System.out.println("Driver operateTo action...");
		}

		@Override
		public void setPosition(int x, int y) {
			System.out.println("Driver setPosition action...");
		}
	}
}
