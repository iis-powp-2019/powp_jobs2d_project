package edu.kis.powp.jobs2d;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

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
	public static void complexCommandTest(){
		
		LineDrawerAdapter _adapter = new LineDrawerAdapter( new CustomLine(Color.RED, true, 20.0f) );
		System.out.println( "Parametry x i y przed operacją: " + _adapter.getPosition() );
		
        List<DriverCommand> commands = new ArrayList<>();
        
        commands.add(new SetPositionCommand(_adapter ).setX( 0 ).setY( 0 ));
        commands.add(new OperateToCommand( _adapter ).setX( 50 ).setY( 50 ));
        commands.add(new OperateToCommand( _adapter ).setX( 50 ).setY( 100));
        commands.add(new OperateToCommand( _adapter ).setX( 0 ).setY( 150));
        commands.add(new OperateToCommand( _adapter ).setX( -50 ).setY( 100));
        commands.add(new OperateToCommand( _adapter ).setX( -50 ).setY( 50));
        commands.add(new OperateToCommand( _adapter ).setX( 0 ).setY( 0));
        
        ComplexCommand commandList = new ComplexCommand( commands );
        commandList.execute();

		System.out.println( "Parametry x i y po operacji: " + _adapter.getPosition() );
	}
}
