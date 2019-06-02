package edu.kis.powp.jobs2d;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
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
	public static void commandTest() {
		
		LineDrawerAdapter _adapter = new LineDrawerAdapter( new CustomLine(Color.RED, true, 20.0f) );
		System.out.println( "Parametry x i y przed operacją: " + _adapter.getPosition() );
		
        List<DriverCommand> commands = new ArrayList<>();
		
        new OperateToCommand( _adapter ).setX( 50 ).setY( 50 ).execute();
        
		System.out.println( "Parametry x i y po operacji: " + _adapter.getPosition() );
		
        new OperateToCommand( _adapter ).setX( 50 ).setY( 100);
        
		System.out.println( "Parametry x i y po operacji: " + _adapter.getPosition() );
		
	}
}
