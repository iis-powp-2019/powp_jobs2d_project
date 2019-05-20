package edu.kis.powp.jobs2d;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.CustomLine;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
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
        SelectTestFigureOptionListener2 selectTestFigureOptionListener2 = new SelectTestFigureOptionListener2(
                DriverFeature.getDriverManager());

        SelectTestFigureJane selectTestFigureJane = new SelectTestFigureJane(
                DriverFeature.getDriverManager());

        SelectTestTriangleOptionListener selectTestTriangleOptionListener = new SelectTestTriangleOptionListener(DriverFeature.getDriverManager());
        SelectTestRectangleOptionListener selectTestRectangleOptionListener = new SelectTestRectangleOptionListener(DriverFeature.getDriverManager());
        application.addTest("Figure Joe 1", selectTestFigureOptionListener);
        application.addTest("Figure Joe 2", selectTestFigureOptionListener2);
        application.addTest("Figure Joe",selectTestFigureJane);
        application.addTest("Triangle",selectTestTriangleOptionListener);
        application.addTest("Rectangle",selectTestRectangleOptionListener);
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

        Job2dDriver testDriver = new LineDrawerAdapter();
        DriverFeature.addDriver("Buggy Simulator", testDriver);

        Job2dDriver testDriverDottedLine = new LineDrawerAdapter(LineFactory.getDottedLine());
        DriverFeature.addDriver("Dotted Simulator", testDriverDottedLine);

        Job2dDriver testDriverSpecialLine = new LineDrawerAdapter(LineFactory.getSpecialLine());
        DriverFeature.addDriver("Special Simulator", testDriverSpecialLine);

        Job2dDriver testDriverCustomLine = new LineDrawerAdapter(new CustomLine(Color.BLUE, 10, true));
        DriverFeature.addDriver("CustomLine Simulator", testDriverCustomLine);


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
                //setupDefaultDrawerVisibilityManagement(app);

                DriverFeature.setupDriverPlugin(app);
                setupDrivers(app);
                setupPresetTests(app);
                setupLogger(app);

                app.setVisibility(true);

                OperateToCommand operateToCommand = new OperateToCommand(2,4,new LoggerDriver());
                operateToCommand.execute();
            }
        });
    }

}
