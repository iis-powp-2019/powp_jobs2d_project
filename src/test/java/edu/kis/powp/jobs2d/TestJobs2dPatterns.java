package edu.kis.powp.jobs2d;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.adapter.BasicLineDrawingAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.SpecialLineDrawingAdapter;
import edu.kis.powp.jobs2d.drivers.command.figures.listeners.SelectFigureOptionListener;
import edu.kis.powp.jobs2d.events.SelectChangeVisibleOptionListener;
import edu.kis.powp.jobs2d.events.SelectFirstTestFigureOptionListener;
import edu.kis.powp.jobs2d.events.SelectJaneFigureOptionListener;
import edu.kis.powp.jobs2d.events.SelectSecondTestFigureOptionListener;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestJobs2dPatterns {

    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Setup test concerning preset figures in context.
     *
     * @param application Application context.
     */
    private static void setupPresetTests(Application application) {
        SelectFirstTestFigureOptionListener selectFirstTestFigureOptionListener = new SelectFirstTestFigureOptionListener(
                DriverFeature.getDriverManager());
        SelectSecondTestFigureOptionListener selectSecondTestFigureOptionListener = new SelectSecondTestFigureOptionListener(
                DriverFeature.getDriverManager());
        SelectJaneFigureOptionListener selectJaneFigureOptionListener = new SelectJaneFigureOptionListener(
                DriverFeature.getDriverManager());
        SelectFigureOptionListener selectTriangleOptionListener = new SelectFigureOptionListener(DriverFeature.getDriverManager(), "Triangle");
        SelectFigureOptionListener selectRectangleOptionListener = new SelectFigureOptionListener(DriverFeature.getDriverManager(), "Rectangle");

        application.addTest("Figure Joe 1", selectFirstTestFigureOptionListener);
        application.addTest("Figure Joe 2", selectSecondTestFigureOptionListener);
        application.addTest("Figure Jane", selectJaneFigureOptionListener);
        application.addTest("Triangle", selectTriangleOptionListener);
        application.addTest("Rectangle", selectRectangleOptionListener);
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

        Job2dDriver basicLineDriver = new BasicLineDrawingAdapter();
        DriverFeature.addDriver("Buggy Simulator", basicLineDriver);

        Job2dDriver specialLineDriver = new SpecialLineDrawingAdapter();
        DriverFeature.addDriver("Special Line Simulator", specialLineDriver);

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
        application.addComponentMenuElement(Logger.class, "Clear log", (ActionEvent e) -> application.flushLoggerOutput());
        application.addComponentMenuElement(Logger.class, "Fine level", (ActionEvent e) -> logger.setLevel(Level.FINE));
        application.addComponentMenuElement(Logger.class, "Info level", (ActionEvent e) -> logger.setLevel(Level.INFO));
        application.addComponentMenuElement(Logger.class, "Warning level", (ActionEvent e) -> logger.setLevel(Level.WARNING));
        application.addComponentMenuElement(Logger.class, "Severe level", (ActionEvent e) -> logger.setLevel(Level.SEVERE));
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
