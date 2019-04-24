package edu.kis.powp.jobs2d;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

/**
 * Plotter test.
 * 
 * @author Dominik
 */
public class Job2dDriverTest {
	// urządzenie
	private static Job2dDriver driver = new StubDriver();

	/**
	 * Driver test.
	 */
	public static void main(String[] args) {
		FiguresJoe.figureScript1(driver);
	}

	// urządzenie wykorzystujące metody z J2D
	private static class StubDriver implements Job2dDriver {

		// ACTIVE
		@Override
		public void operateTo(int x, int y) {
			System.out.println("OPERATE TO x: " + x + "y: " + y);
		}

		// PASSIVE
		@Override
		public void setPosition(int x, int y) {
			System.out.println("SET POSITION x: " + x + "y: " + y);
		}
	};
}
