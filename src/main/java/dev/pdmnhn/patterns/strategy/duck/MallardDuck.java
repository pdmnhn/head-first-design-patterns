package dev.pdmnhn.patterns.strategy.duck;

import dev.pdmnhn.patterns.strategy.fly.FlyWithWings;
import dev.pdmnhn.patterns.strategy.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
