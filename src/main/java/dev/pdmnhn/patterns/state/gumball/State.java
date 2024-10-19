package dev.pdmnhn.patterns.state.gumball;

public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
