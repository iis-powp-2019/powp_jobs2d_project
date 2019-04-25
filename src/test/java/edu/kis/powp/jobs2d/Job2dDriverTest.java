package edu.kis.powp.jobs2d;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.util.ArrayList;
import java.util.Arrays;

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

		FiguresJoe.figureScript1(driver);
		System.out.println("----------------------");
		SetPositionCommand command = new SetPositionCommand(driver,10,10);
		OperateToCommand command2 = new OperateToCommand(driver,20,20);
		command.execute();
		command2.execute();
		System.out.println("----------------------");
		ComplexCommand complex = new ComplexCommand(new ArrayList(Arrays.asList(command,command2)));
		complex.execute();
		System.out.println("----------------------");
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
	};
}
