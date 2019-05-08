package edu.kis.powp.jobs2d;

import java.awt.Color;

import edu.kis.powp.command.*;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;

/**
 * Plotter test.
 * 
 * @author Dominik
 */
public class ComplexCommandTest {

	/**
	 * Command test.
	 */
	public static void main(String[] args) {
		
		LineDrawerAdapter _adapter = new LineDrawerAdapter( new CustomLine(Color.RED, true, 20.0f) );
		System.out.println( "Parametry x i y przed operacją: " + _adapter.getPosition() );
		
		ComplexCommand complex = new ComplexCommand();
		
		
	}
}
