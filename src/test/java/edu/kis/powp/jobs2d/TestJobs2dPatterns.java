package edu.kis.powp.jobs2d;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DrawPaneControllerToJob2dDriverAdapter;
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
		SelectTestFigureOptionListener selectFirstTestFigureOptionListener = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), 1);

		SelectTestFigureOptionListener selectSecondTestFigureOptionListener = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), 2);


		application.addTest("Figure Joe 1", selectFirstTestFigureOptionListener);
		application.addTest("Figure Joe 2", selectSecondTestFigureOptionListener);
		application.addTest("draw rectangle", drawRectangle(DriverFeature.getDriverManager()));
		application.addTest("draw triangle", drawTriangle(DriverFeature.getDriverManager()));
	}

	private static ActionListener drawRectangle(DriverManager driverManager) {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ComplexCommand rectangleDrawer = new ComplexCommand(new ArrayList<>());
				rectangleDrawer.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(), 10,10));
				rectangleDrawer.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 30, 10));
				rectangleDrawer.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 30, 30));
				rectangleDrawer.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 10,30));
				rectangleDrawer.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 10,10));

				rectangleDrawer.execute();
			}
		};
	}

	private static ActionListener drawTriangle(DriverManager driverManager) {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ComplexCommand triangleDrawer = new ComplexCommand(new ArrayList<>());
				triangleDrawer.addCommand(new SetPositionCommand(driverManager.getCurrentDriver(), 15,15));
				triangleDrawer.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 25, 35));
				triangleDrawer.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 5, 35));
				triangleDrawer.addCommand(new OperateToCommand(driverManager.getCurrentDriver(), 15,15));

				triangleDrawer.execute();
			}
		};
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

		Job2dDriver testDriver = new DrawPaneControllerToJob2dDriverAdapter(DrawerFeature.getDrawerController());
		DriverFeature.addDriver("Buggy Simulator", testDriver);

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

				DriverFeature.setupDriverPlugin(app);
				setupDrivers(app);
				setupPresetTests(app);
				setupLogger(app);

				app.setVisibility(true);
			}
		});
	}

}
