package edu.kis.powp.jobs2d;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.adapter.BasicLineDriverAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.FigureJaneAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.SpecialLineDrawerAdapter;
import edu.kis.powp.jobs2d.events.*;
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

        application.addTest("Figure Joe 1", new SelectTestFigureOptionListener(DriverFeature.getDriverManager()));
        application.addTest("Figure Joe 2", new SelectTestFigure2OptionListener(DriverFeature.getDriverManager()));
        application.addTest("Figure Jane", new SelectFigureJaneOptionListener(DriverFeature.getDriverManager()));
        application.addTest("Command", new SelectCommandOptionListener(DriverFeature.getDriverManager()));
        application.addTest("Command Circle", new SelectCircleFigureCommand(DriverFeature.getDriverManager()));
        application.addTest("Commant Rectangle", new SelectRectangleFigureCommand(DriverFeature.getDriverManager()));
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

        Job2dDriver testDriver = new BasicLineDriverAdapter();
        DriverFeature.addDriver("Buggy Simulator", testDriver);

        Job2dDriver lineDrawer = new SpecialLineDrawerAdapter();
        DriverFeature.addDriver("Solid Simulator", lineDrawer);

        Job2dDriver janeDriver = new FigureJaneAdapter();
        DriverFeature.addDriver("Jane adapter", janeDriver);

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
