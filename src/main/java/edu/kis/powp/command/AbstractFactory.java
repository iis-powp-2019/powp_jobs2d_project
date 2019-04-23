package edu.kis.powp.command;

public interface AbstractFactory<T> {

    T create(String figureType);
}
