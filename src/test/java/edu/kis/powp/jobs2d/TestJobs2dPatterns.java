package edu.kis.powp.jobs2d;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.adapter.AbstractDriverAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.DrawPanelControllerToJobs2dDriverAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.events.*;
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
        SelectTestFigureOptionListener selectTestFigureOptionListener = new SelectTestFigureOptionListener(
                DriverFeature.getDriverManager());

        SelectTestFigureSecondOptionListener selectTestFigureSecondOptionListener = new SelectTestFigureSecondOptionListener(
                DriverFeature.getDriverManager());

        SelectTestFigureJaneOptionListener selectTestFigureJaneOptionListener = new SelectTestFigureJaneOptionListener(
                DriverFeature.getDriverManager());

        SelectTestCommandFigureOptionListener selectTestCommandFigureOptionListener = new SelectTestCommandFigureOptionListener(
                DriverFeature.getDriverManager());

        SelectTestTriangleOptionListener selectTestTriangleOptionListener = new SelectTestTriangleOptionListener(
                DriverFeature.getDriverManager());

        SelectTestDeltoidOptionListener selectTestDeltoidOptionListener = new SelectTestDeltoidOptionListener(
                DriverFeature.getDriverManager());

        SelectTestCircleOptionListener selectTestCircleOptionListener = new SelectTestCircleOptionListener(
                DriverFeature.getDriverManager());

        application.addTest("Figure Joe 1", selectTestFigureOptionListener);
        application.addTest("Figure Joe 2", selectTestFigureSecondOptionListener);
        application.addTest("Figure Jane", selectTestFigureJaneOptionListener);
        application.addTest("Figure from Commands List", selectTestCommandFigureOptionListener);
        application.addTest("Triangle", selectTestTriangleOptionListener);
        application.addTest("Circle", selectTestCircleOptionListener);
        application.addTest("Deltoid", selectTestDeltoidOptionListener);
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

        Job2dDriver testDriver = new DrawPanelControllerToJobs2dDriverAdapter(DrawerFeature.getDrawerController());
        DriverFeature.addDriver("Buggy Basic Line Simulator", testDriver);

        Job2dDriver testDriverSecond = new LineDrawerAdapter(DrawerFeature.getDrawerController(), LineFactory.getSpecialLine());
        DriverFeature.addDriver("Buggy Special Line Simulator", testDriverSecond);

        Job2dDriver testDriverThird = new LineDrawerAdapter(DrawerFeature.getDrawerController(), LineFactory.getDottedLine());
        DriverFeature.addDriver("Buggy Dotted Line Simulator", testDriverThird);

        Job2dDriver testDriverFourth = new LineDrawerAdapter(DrawerFeature.getDrawerController(),
                new ConfigurableLine(Color.GREEN, 1.5f, true));
        DriverFeature.addDriver("Buggy Configurable Line Simulator", testDriverFourth);

        Job2dDriver abstractDriverAdapter = new AbstractDriverAdapter(0, 0, DrawerFeature.getDrawerController(),
                LineFactory.getDottedLine());
        DriverFeature.addDriver("Buggy AbstractDriverAdapter and Figure Jane Simulator", abstractDriverAdapter);

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
