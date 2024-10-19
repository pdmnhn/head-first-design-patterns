package dev.pdmnhn.patterns.state.gumball;

public class GumballMachine {
    private final State soldOutState = new SoldOutState(this);
    private final State noQuarterState = new NoQuarterState(this);
    private final State hasQuarterState = new HasQuarterState(this);
    private final State soldState = new SoldState(this);
    private final State winnerState = new WinnerState(this);
    private State state;
    private int count;

    public GumballMachine(int gumballs) {
        if (gumballs < 0) {
            throw new IllegalArgumentException("Count cannot be lesser than 0");
        }
        count = gumballs;
        state = gumballs > 0 ? noQuarterState : soldOutState;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public boolean gumballAvailable() {
        return !(state instanceof SoldOutState);
    }

    public void turnCrank() {
        state.turnCrank();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        count--;
    }

    void setState(State state) {
        this.state = state;
    }

    State getState() {
        return state;
    }

    State getSoldState() {
        return soldState;
    }

    State getWinnerState() {
        return winnerState;
    }

    State getHasQuarterState() {
        return hasQuarterState;
    }

    State getNoQuarterState() {
        return noQuarterState;
    }

    State getSoldOutState() {
        return soldOutState;
    }

    int getCount() {
        return count;
    }
}
