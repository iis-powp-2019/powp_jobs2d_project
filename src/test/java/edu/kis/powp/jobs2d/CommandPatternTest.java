package edu.kis.powp.jobs2d;

import java.awt.Color;

import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;

/**
 * Plotter test.
 * 
 * @author Dominik
 */
public class CommandPatternTest {

	/**
	 * Command test.
	 */
	public static void main(String[] args) {
		
		LineDrawerAdapter _adapter = new LineDrawerAdapter( new CustomLine(Color.RED, true, 20.0f) );
		System.out.println( "Parametry x i y przed operacją: " + _adapter.getPosition() );
		
		SetPositionCommand operate = new SetPositionCommand();
		operate.setX( 10 ).setY( 20 ).execute( _adapter );
		
		System.out.println( "Parametry x i y po operacji: " + _adapter.getPosition() );
		
		operate.setX( 10 ).setY( 40 ).execute( _adapter );
		System.out.println( "Parametry x i y po operacji: " + _adapter.getPosition() );
		
	}
}
