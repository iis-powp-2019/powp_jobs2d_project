package edu.kis.powp.command;

public interface AbstractCommandFactory<T> {
    T createFigure(String type);
}
