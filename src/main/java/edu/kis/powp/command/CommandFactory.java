package edu.kis.powp.command;

public interface CommandFactory<T> {

    T create(String figureType);

}
