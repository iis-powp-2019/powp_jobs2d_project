package edu.kis.powp.jobs2d;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.CustomLine;
import edu.kis.powp.jobs2d.drivers.adapter.DrawPanelControllerToJob2dDriverAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.events.SelectChangeVisibleOptionListener;
import edu.kis.powp.jobs2d.events.SelectTestFigureOptionListener;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class TestJobs2dPatterns {
	private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Setup test concerning preset figures in context.
	 * 
	 * @param application Application context.
	 */
	private static void setupPresetTests(Application application) {
		SelectTestFigureOptionListener selectTestFigureOptionListener1 = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), "Figure Joe 1");

        SelectTestFigureOptionListener selectTestFigureOptionListener2 = new SelectTestFigureOptionListener(
                DriverFeature.getDriverManager(), "Figure Joe 2");

		SelectTestFigureOptionListener selectTestFigureOptionListenerSquare = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), "Square");

		SelectTestFigureOptionListener selectTestFigureOptionListenerRectangle = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), "Rectangle");

		SelectTestFigureOptionListener selectTestFigureOptionListenerTriangle = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), "Triangle");

		application.addTest("Figure Joe 1", selectTestFigureOptionListener1);
        application.addTest("Figure Joe 2", selectTestFigureOptionListener2);
        application.addTest("ComplexCommand Test", new ActionListener() {

	        @Override public void actionPerformed(ActionEvent e) {
		        List<DriverCommand> commands = new ArrayList<>();

		        commands.add(new SetPositionCommand(-60,-60,DriverFeature.getDriverManager().getCurrentDriver()));
		        commands.add(new OperateToCommand(60,-60,DriverFeature.getDriverManager().getCurrentDriver()));
		        commands.add(new OperateToCommand(60,60,DriverFeature.getDriverManager().getCurrentDriver()));
		        commands.add(new OperateToCommand(-60,60,DriverFeature.getDriverManager().getCurrentDriver()));
		        commands.add(new OperateToCommand(-60,-60,DriverFeature.getDriverManager().getCurrentDriver()));

		        ComplexCommand complexCommand = new ComplexCommand(commands);
		        complexCommand.execute();
	        }
        });
        application.addTest("Square", selectTestFigureOptionListenerSquare);
		application.addTest("Rectangle", selectTestFigureOptionListenerRectangle);
		application.addTest("Triangle", selectTestFigureOptionListenerTriangle);
	}

	/**
	 * Setup driver manager, and set default driver for application.
	 * 
	 * @param application Application context.
	 */
	private static void setupDrivers(Application application) {
		Job2dDriver loggerDriver = new LoggerDriver();
		DriverFeature.addDriver("Logger Driver", loggerDriver);
		DriverFeature.getDriverManager().setCurrentDriver(loggerDriver);

		Job2dDriver testDriver = new DrawPanelControllerToJob2dDriverAdapter(DrawerFeature.getDrawerController());
		DriverFeature.addDriver("Buggy Simulator", testDriver);

		Job2dDriver lineDrawerDriver = new LineDrawerAdapter(DrawerFeature.getDrawerController(), new CustomLine(LineFactory.getSpecialLine()));
		DriverFeature.addDriver("Special Line Simulator", lineDrawerDriver);

		DriverFeature.updateDriverInfo();
	}

	/**
	 * Auxiliary routines to enable using Buggy Simulator.
	 * 
	 * @param application Application context.
	 */
	private static void setupDefaultDrawerVisibilityManagement(Application application) {
		DefaultDrawerFrame defaultDrawerWindow = DefaultDrawerFrame.getDefaultDrawerFrame();
		application.addComponentMenuElementWithCheckBox(DrawPanelController.class, "Default Drawer Visibility",
				new SelectChangeVisibleOptionListener(defaultDrawerWindow), true);
		defaultDrawerWindow.setVisible(true);
	}

	/**
	 * Setup menu for adjusting logging settings.
	 * 
	 * @param application Application context.
	 */
	private static void setupLogger(Application application) {
		application.addComponentMenu(Logger.class, "Logger", 0);
		application.addComponentMenuElement(Logger.class, "Clear log",
				(ActionEvent e) -> application.flushLoggerOutput());
		application.addComponentMenuElement(Logger.class, "Fine level", (ActionEvent e) -> logger.setLevel(Level.FINE));
		application.addComponentMenuElement(Logger.class, "Info level", (ActionEvent e) -> logger.setLevel(Level.INFO));
		application.addComponentMenuElement(Logger.class, "Warning level",
				(ActionEvent e) -> logger.setLevel(Level.WARNING));
		application.addComponentMenuElement(Logger.class, "Severe level",
				(ActionEvent e) -> logger.setLevel(Level.SEVERE));
		application.addComponentMenuElement(Logger.class, "OFF logging", (ActionEvent e) -> logger.setLevel(Level.OFF));
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Application app = new Application("2d jobs Visio");
				DrawerFeature.setupDrawerPlugin(app);
				//setupDefaultDrawerVisibilityManagement(app);

				DriverFeature.setupDriverPlugin(app);
				setupDrivers(app);
				setupPresetTests(app);
				setupLogger(app);

				app.setVisibility(true);
			}
		});
	}

}
