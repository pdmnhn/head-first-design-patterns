package dev.pdmnhn.patterns.state;

import java.util.Random;
import dev.pdmnhn.patterns.state.gumball.GumballMachine;

public class GumballTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(25);
        Random random = new Random(System.currentTimeMillis());
        while (gumballMachine.gumballAvailable()) {
            gumballMachine.insertQuarter();
            if (random.nextInt(10) > 0) {
                gumballMachine.turnCrank();
            } else {
                gumballMachine.ejectQuarter();
            }
        }
    }
}
