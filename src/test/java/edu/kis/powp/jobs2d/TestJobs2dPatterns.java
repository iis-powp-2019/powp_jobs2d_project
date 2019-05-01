package edu.kis.powp.jobs2d;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.Command.ComplexCommand;
import edu.kis.powp.jobs2d.Command.DriverCommand;
import edu.kis.powp.jobs2d.Command.OperateToCommand;
import edu.kis.powp.jobs2d.Command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.SelectCommandFactoryMenuOptionListener;
import edu.kis.powp.jobs2d.drivers.adapter.DrawPaneControllerToJob2dDriverAdapter;
import edu.kis.powp.jobs2d.events.SelectChangeVisibleOptionListener;
import edu.kis.powp.jobs2d.events.SelectTestFigureOptionListener;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;

public class TestJobs2dPatterns {
	private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Setup test concerning preset figures in context.
	 * 
	 * @param application Application context.
	 */
	private static void setupPresetTests(Application application) {
		SelectTestFigureOptionListener selectFirstTestFigureOptionListener = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), 1);
		SelectTestFigureOptionListener selectSecondTestFigureOptionListener = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), 2);

		application.addTest("Figure Joe 1", selectFirstTestFigureOptionListener);
		application.addTest("Figure Joe 2", selectSecondTestFigureOptionListener);
		application.addTest("Complex Command", new ActionListener() {

			@Override public void actionPerformed(ActionEvent e) {
				List<DriverCommand> commands = new ArrayList<>();

				commands.add(new SetPositionCommand(-60,-60, DriverFeature.getDriverManager().getCurrentDriver()));
				commands.add(new OperateToCommand(60,-60, DriverFeature.getDriverManager().getCurrentDriver()));
				commands.add(new OperateToCommand(60,60, DriverFeature.getDriverManager().getCurrentDriver()));
				commands.add(new OperateToCommand(-60,60, DriverFeature.getDriverManager().getCurrentDriver()));
				commands.add(new OperateToCommand(-60,-60, DriverFeature.getDriverManager().getCurrentDriver()));

				ComplexCommand complexCommand = new ComplexCommand(commands);
				complexCommand.execute();
			}

		});
		application.addTest("Triangle", new SelectCommandFactoryMenuOptionListener(DriverFeature.getDriverManager(),"triangle"));
		application.addTest("Square", new SelectCommandFactoryMenuOptionListener(DriverFeature.getDriverManager(),"square"));
		application.addTest("Rectangle", new SelectCommandFactoryMenuOptionListener(DriverFeature.getDriverManager(),"rectangle"));
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

		Job2dDriver testDriver = new DrawPaneControllerToJob2dDriverAdapter();
		DriverFeature.addDriver("Buggy Simulator", testDriver);

		Job2dDriver dottedLineDriver = new LineDrawerAdapter(LineFactory.getDottedLine());
		DriverFeature.addDriver("Driver for dotted line", dottedLineDriver);

		Job2dDriver specialLineDriver = new LineDrawerAdapter(LineFactory.getSpecialLine());
		DriverFeature.addDriver("Driver for special line", specialLineDriver);

		Job2dDriver lineWithParametersDriver = new LineDrawerAdapter(new LineWithParameters(Color.red, 4, true));
		DriverFeature.addDriver("Driver for line with parameters", lineWithParametersDriver);

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
		defaultDrawerWindow.setVisible(false);
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
