package edu.kis.powp.jobs2d;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.Command.ComplexCommandParserDriver;
import edu.kis.powp.jobs2d.command.Figures.CommandIIS;
import edu.kis.powp.jobs2d.drivers.adapter.DriverToDrawerAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.drivers.line_decoration.ColorDecoratedLine;
import edu.kis.powp.jobs2d.drivers.line_decoration.DottedDecoratedLine;
import edu.kis.powp.jobs2d.drivers.line_decoration.ThicknessDecoratedLine;
import edu.kis.powp.jobs2d.events.SelectChangeVisibleOptionListener;
import edu.kis.powp.jobs2d.events.SelectTestCommandOptionListener;
import edu.kis.powp.jobs2d.events.SelectTestFigureOptionListener;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class TestJobs2dPatterns {
	private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Setup test concerning preset figures in context.
	 * 
	 * @param application Application context.
	 */
	private static void setupPresetTests(Application application) {
		SelectTestFigureOptionListener selectTestFigureOptionListener = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), FiguresJoe::figureScript1);

		application.addTest("Figure Joe 1", selectTestFigureOptionListener);

		SelectTestFigureOptionListener selectTestFigureOptionListenerTwo = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), FiguresJoe::figureScript2);

		application.addTest("Figure Joe 2", selectTestFigureOptionListenerTwo);


		SelectTestCommandOptionListener selectTestCommandOptionListener = new SelectTestCommandOptionListener(
				DriverFeature.getDriverManager(), CommandIIS.getFigure());

		application.addTest("Command IIS", selectTestCommandOptionListener);

        SelectTestCommandOptionListener selectTestParsedCommandOptionListener = new SelectTestCommandOptionListener(
                DriverFeature.getDriverManager(), new ComplexCommandParserDriver().parseComplexCommand(FiguresJoe::figureScript1));

        application.addTest("Figure Joe 1 Command-Parsed", selectTestParsedCommandOptionListener);
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

		Job2dDriver testDriver = new DriverToDrawerAdapter(DrawerFeature.getDrawerController());
		DriverFeature.addDriver("Adapter Driver", testDriver);

		Job2dDriver dottedLineDriver = new LineDrawerAdapter(DrawerFeature.getDrawerController(),
				LineFactory.getDottedLine());
		DriverFeature.addDriver("Dotted Line Driver", dottedLineDriver);


		Job2dDriver specialLineDriver = new LineDrawerAdapter(DrawerFeature.getDrawerController(),
				LineFactory.getSpecialLine());
		DriverFeature.addDriver("Special Line Driver", specialLineDriver);

		Job2dDriver pinkThickLineDriver = new LineDrawerAdapter(DrawerFeature.getDrawerController(),
				new ThicknessDecoratedLine(15f,
						new ColorDecoratedLine(Color.PINK, LineFactory.getBasicLine())));
		DriverFeature.addDriver("Pink Thick Line Driver", pinkThickLineDriver);

		Job2dDriver brownDottedLineDriver = new LineDrawerAdapter(DrawerFeature.getDrawerController(),
				new ColorDecoratedLine(new Color(139,69,19),
						new DottedDecoratedLine(true, LineFactory.getBasicLine())));
		DriverFeature.addDriver("Brown Dotted Line Driver", brownDottedLineDriver);

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
		EventQueue.invokeLater(() -> {
			Application app = new Application("2d jobs Visio");
			DrawerFeature.setupDrawerPlugin(app);
			setupDefaultDrawerVisibilityManagement(app);

			DriverFeature.setupDriverPlugin(app);
			setupDrivers(app);
			setupPresetTests(app);
			setupLogger(app);

			app.setVisibility(true);
		});
	}

}
