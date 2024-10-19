package dev.pdmnhn.patterns.state.gumball;

import java.util.Random;

public class HasQuarterState implements State {
    private final GumballMachine gumballMachine;
    private final Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned the crank");
        boolean isWinner = randomWinner.nextInt(10) == 0;
        if (isWinner && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
        gumballMachine.getState().dispense();
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
