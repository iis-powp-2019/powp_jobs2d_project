package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;

public class ShapeFactory {

    public static ComplexCommand getTriangle(){return TriangleShape.prepareTriangle();}
    public static ComplexCommand getletterM(){return LetterMShape.prepareLetterMShape();}
}
