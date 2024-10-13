package dev.pdmnhn.patterns.strategy.duck;

import dev.pdmnhn.patterns.strategy.fly.FlyNoWay;
import dev.pdmnhn.patterns.strategy.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
